import java.util.Scanner;

public class Java_1355 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a - i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
