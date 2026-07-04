import java.util.Scanner;

public class Java_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int r = a + b + c;
        double r2 = (double) r / 3;
        System.out.println(r);
        System.out.printf("%.1f",r2);
    }
}
