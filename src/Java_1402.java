import java.util.Scanner;

public class Java_1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = scanner.nextInt();
        }
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
    }
}
