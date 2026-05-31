import java.util.Scanner;

public class Java_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a >= 50.0 && a <= 60.0) {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
