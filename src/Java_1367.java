import java.util.Scanner;

public class Java_1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
