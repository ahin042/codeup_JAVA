import java.util.Scanner;

public class Java_1371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i * 2 - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= a * 2 - i * 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}