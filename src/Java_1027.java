import java.util.Scanner;

public class Java_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.next().split("\\.");
        int year = Integer.parseInt(list[0]);
        int month = Integer.parseInt(list[1]);
        int day = Integer.parseInt(list[2]);
        System.out.printf("%02d-%02d-%04d%n", day, month, year);
    }
}
