import java.util.Scanner;

public class Java_1258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            b += i;
        }
        System.out.println(b);
    }
}
