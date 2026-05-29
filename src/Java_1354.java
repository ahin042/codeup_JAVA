import java.util.Scanner;

public class Java_1354 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
