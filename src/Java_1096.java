import java.util.Scanner;

public class Java_1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[19][19];
        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a[x - 1][y - 1] = 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
