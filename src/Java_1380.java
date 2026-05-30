import java.util.Scanner;

public class Java_1380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i < a; i++) {
            if (a - i <= 6 && i <= 6) {
                System.out.println(i + " " + (a - i));
            }
        }
    }
}
