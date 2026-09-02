import java.util.Scanner;

public class Java_1500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        String[][] n = new String[a][];
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i < a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n[i].length; j++) {
                if (j > 0) sb.append(" ");
                sb.append(n[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
