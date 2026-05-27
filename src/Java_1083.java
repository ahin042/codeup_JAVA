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
                    System.out.print("짝");
                }
                System.out.print(" ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
