import java.sql.SQLOutput;
import java.util.Scanner;

public class Java_1081 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i + " ");
                System.out.println(j);
            }
        }
    }
}
