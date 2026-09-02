import java.util.Scanner;

public class Java_1270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).endsWith("1")) {
                r++;
            }
        }

        System.out.println(r);
    }
}
