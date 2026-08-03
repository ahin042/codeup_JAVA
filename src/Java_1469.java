import java.util.Scanner;

public class Java_1469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] list = new int[a][a];
        int c = 1;

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = a - 1; j > -1; j--) {
                    list[i][j] = c;
                    c += 1;
                }
            }
            else {
                for (int j = 0; j < a; j++) {
                    list[i][j] = c;
                    c += 1;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
