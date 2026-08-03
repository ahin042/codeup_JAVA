import java.util.Scanner;

public class Java_1472 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] list = new int[a][b];
        int c = a * b;

        for (int i = 0; i < a; i++) {
            if ((a - 1 - i) % 2 == 0) {
                for (int j = 0; j < b; j++) {
                    list[i][j] = c;
                    c--;
                }
            } else {
                for (int j = b - 1; j > -1; j--) {
                    list[i][j] = c;
                    c--;
                }
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
