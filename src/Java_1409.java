import java.util.Scanner;

public class Java_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] m = new int[10];
        for (int i = 0; i < 10; i ++) {
            m[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        System.out.println(m[a - 1]);
    }
}
