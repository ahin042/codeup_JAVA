import java.util.Scanner;

public class Java_1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String[] lst = a.split("-");
        System.out.println(lst[0] + lst[1]);
    }
}
