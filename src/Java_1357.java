import java.util.Scanner;

public class Java_1357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
