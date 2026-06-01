import java.util.Scanner;

public class Java_1266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            c += b;
        }
        System.out.println(c);
    }
}
