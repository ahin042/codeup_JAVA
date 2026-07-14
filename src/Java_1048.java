import java.util.Scanner;

public class Java_1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (int) (a * Math.pow(2, b));
        System.out.println(c);
    }
}
