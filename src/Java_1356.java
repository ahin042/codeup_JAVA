import java.util.Scanner;

public class Java_1356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else {
                System.out.print("*");
                for (int j = 0; j < a - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
