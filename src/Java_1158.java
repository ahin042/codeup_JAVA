import java.util.Scanner;

public class Java_1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 30 && a <= 40 || a >= 60 && a <= 70) {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
