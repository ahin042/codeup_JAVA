import java.util.Scanner;

public class Java_1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] a = new int[h][w];
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    a[x - 1][y - 1 + j] = 1;
                }
                else {
                    a[x - 1 + j][y - 1] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}