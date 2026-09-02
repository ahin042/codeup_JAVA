import java.util.Scanner;

public class Java_1493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] n = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        int[][] m = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int x = 0; x <= i; x++) {
                    for (int y = 0; y <= j; y++) {
                        m[i][j] += n[x][y];
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j > 0) sb.append(" ");
                sb.append(m[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
