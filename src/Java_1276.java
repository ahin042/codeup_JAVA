import java.util.Scanner;

public class Java_1276 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a;
        for (int i = 1; i < a; i ++) {
            b *= a - i;
        }
        System.out.println(b);
    }
}
