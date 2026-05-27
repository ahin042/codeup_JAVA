import java.util.Scanner;

public class Java_1084 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int count = 0;
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                for (int z = 0; z < c; z++) {
                    System.out.print(x + " ");
                    System.out.print(y + " ");
                    System.out.println(z);
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
