import java.util.Scanner;

public class Java_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            if (b + i >= a) {
                System.out.println(i);
                break;
            }
            else {
                b += i;
            }
        }
    }
}
