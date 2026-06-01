import java.util.Scanner;

public class Java_1279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                c += i;
            }
            else {
                c -= i;
            }
        }
        System.out.println(c);
    }
}
