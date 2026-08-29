import java.util.Scanner;

public class Java_1553 {
    public static long fun(double a) {
        long c = (long) a;
        if (a > 0 && a > (double) c) {
            return c + 1;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(fun(a));
        scanner.close();
    }
}