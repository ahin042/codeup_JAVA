import java.util.Scanner;

public class Java_1201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("양수");
        }
        else if (a < 0) {
            System.out.println("음수");
        }
        else {
            System.out.println("0");
        }
    }
}
