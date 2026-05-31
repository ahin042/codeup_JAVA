import java.util.Scanner;

public class Java_1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (i %2 == 0) {
                b += i;
            }
        }
        System.out.println(b);
    }
}
