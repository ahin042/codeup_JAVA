import java.util.Scanner;

public class Java_1370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int j = h - 2; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}