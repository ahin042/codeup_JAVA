import java.util.Scanner;

public class Java_1368 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char c = scanner.next().charAt(0);
        if (c == 'L') {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (c == 'R') {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
