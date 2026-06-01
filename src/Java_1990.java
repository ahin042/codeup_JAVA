import java.util.Scanner;

public class Java_1990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a % 3 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
