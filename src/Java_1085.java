import java.util.Scanner;

public class Java_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();
        double a = (double)(h * b * c * s) / 8388608.0;
        double m = Math.round(a * 10) / 10.0;
        System.out.printf("%.1f MB", m);
    }
}