import java.util.Scanner;

public class Java_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hex = sc.next().charAt(0);
        int n = Character.digit(hex, 16);

        for (int i = 1; i <= 15; i++) {
            int result = n * i;
            System.out.println(hex + "*"
                    + Integer.toString(i, 16).toUpperCase() + "="
                    + Integer.toString(result, 16).toUpperCase());
        }
    }
}