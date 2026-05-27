import java.util.Scanner;

public class Java_1083 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            int count = 0;
            String str = i + "";

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                    count += 1;
                }
            }
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print(" X");
                }
                continue;
            }
            if (i != 1) {
                System.out.print(" " + i);
            }
            else {
                System.out.print(i);
            }
        }
    }
}
