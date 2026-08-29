import java.util.Scanner;

public class Java_1660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] list = a.split(",");
        for (String i : list) {
            System.out.print(i + " ");
        }
    }
}