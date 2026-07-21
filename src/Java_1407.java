import java.util.Scanner;

public class Java_1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] lst = a.split(" ");
        for (String i : lst) {
            System.out.print(i);
        }
    }
}