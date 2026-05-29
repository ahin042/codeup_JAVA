import java.util.Scanner;

public class Java_1287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 9; i ++) {
            for (int j = 1; j <= a * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
