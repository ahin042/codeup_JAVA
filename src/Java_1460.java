import java.util.Scanner;

public class Java_1460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] list = new int[a][a];
        int c = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                list[i][j] = c;
                c += 1;
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
