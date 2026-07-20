import java.util.Scanner;

public class Java_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] parts = s.split("\\.");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
    }
}