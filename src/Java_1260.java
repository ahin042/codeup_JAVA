import java.util.Scanner;

public class Java_1260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                c += i;
            }
        }
        System.out.println(c);
    }
}
