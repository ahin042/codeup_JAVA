import java.util.Scanner;

public class Java_1206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 0;
        if (a < b) {
            while (true) {
                i += 1;
                if (a * i == b && i < b) {
                    System.out.println(a + "*" + i + "=" + b);
                    i = 0;
                    break;
                }
            }
        }
        else {
            while (true) {
                i += 1;
                if (b * i == a && i < a) {
                    System.out.println(b + "*" + i + "=" + a);
                    i = 0;
                    break;
                }
            }
        }
        if (i != 0) {
            System.out.println("none");
        }
    }
}
