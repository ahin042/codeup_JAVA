import java.util.Scanner;

public class Java_1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 10;
        a %= b * 10;
        a *= 10;
        a += b;
        b = a * 2;
        System.out.println(b);
        if (b <= 50) {
            System.out.println("GOOD");
        }
        else {
            System.out.println("OH MY GOD");
        }
    }
}
