import java.util.Scanner;

public class Java_1155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 7 == 0) {
            System.out.println("multiple");
        }
        else {
            System.out.println("not multiple");
        }
    }
}
