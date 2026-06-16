import java.util.Scanner;

public class Java_1403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] m = new int[a];

        for (int i = 0; i < a ; i++) {
            m[i] = scanner.nextInt();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.println(m[j]);
            }
        }
    }
}
