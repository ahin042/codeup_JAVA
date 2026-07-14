import java.util.Scanner;

public class Java_1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        if (a < 0) {
            System.out.println("minus");
        }
        else {
            System.out.println("plus");
        }
        if (a % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
