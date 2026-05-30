import java.util.Scanner;

public class Java_1365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 2 - 1;

        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }

        System.out.println();
        for (int i = 1; i <= b; i++) {
            System.out.print("*");
            for (int j = 1; j< i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= b * 2 - i * 2 + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.print("*");
        for (int i = 1; i <= (a - 3) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i <= (a - 3) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");


        for (int i = 1; i <= b; i++) {
            System.out.print("*");
            for (int j = 1; j< b - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < b - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
    }
}
