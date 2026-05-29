import java.util.Scanner;

public class Java_1358 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i <= a; i += 2) {
            for (int j = 0; j < (a - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}