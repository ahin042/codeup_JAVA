import java.util.Scanner;

public class Java_6087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
