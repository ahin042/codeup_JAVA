import java.util.Scanner;

public class Java_1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (b + i >= a) {
                b += i;
                System.out.println(b);
                break;
            }
            else {
                b += i;
            }
        }
    }
}
