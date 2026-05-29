import java.util.Scanner;

public class Java_1352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
