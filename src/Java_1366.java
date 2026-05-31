import java.util.Scanner;

public class Java_1366 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= (a - 3) / 2; i++) {
            System.out.print("*");
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= (a - 5) / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= (a - 5) / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= (a - 3) / 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= (a - 5) / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= (a - 5) / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
