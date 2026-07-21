import java.util.Scanner;

public class Java_1466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 1;
        int[][] list = new int[a][b];
        for (int i = b - 1; i >= 0; i--) {
            for (int j = a - 1; j >= 0; j--) {
                list[j][i] = c;
                c += 1;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
