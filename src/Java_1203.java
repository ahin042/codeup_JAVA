import java.util.Scanner;

public class Java_1203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 10) {
            System.out.println("정상");
        }
        else if (a <= 20) {
            System.out.println("과체중");
        }
        else {
            System.out.println("비만");
        }
    }
}
