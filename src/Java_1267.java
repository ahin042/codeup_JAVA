import java.util.Scanner;

public class Java_1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            if (b % 5 == 0) {
                c += b;
            }
        }
        System.out.println(c);
    }
}
