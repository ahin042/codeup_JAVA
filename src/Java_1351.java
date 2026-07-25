import java.util.Scanner;

public class Java_1351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int m = a; m <= b; m++) {
            for (int i = 1; i<= 9; i++) {
                System.out.println(m + "*" + i + "=" + m * i);
            }
        }
    }
}
