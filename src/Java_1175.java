import java.util.Scanner;

public class Java_1175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 7 == 0 || (a - 6) % 7 == 0) {
            System.out.println("주말");
        }
        else {
            System.out.println("주중");
        }
    }
}
