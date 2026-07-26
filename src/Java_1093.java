import java.util.Scanner;

public class Java_1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[24];

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            count[t]++;
        }

        for (int i = 1; i <= 23; i++) {
            System.out.print(count[i]);
            if (i < 23)  {
                System.out.print(" ");
            }
        }
    }
}