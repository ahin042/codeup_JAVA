import java.util.Scanner;

public class Java_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 10) {
            System.out.println("small");
        }
        else {
            System.out.println("big");
        }
    }
}
