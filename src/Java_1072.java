import java.util.Scanner;

public class Java_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            int m = scanner.nextInt();
            list[i] = m;
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
