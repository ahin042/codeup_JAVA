import java.util.Scanner;

public class Java_1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        c -= 1;
        while (c != 0) {
            c -= 1;
            a += b;
        }
        System.out.println(a);
    }
}
