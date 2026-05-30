import java.util.Scanner;

public class Java_1378 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                b += j;
            }
        }
        System.out.println(b);
    }
}