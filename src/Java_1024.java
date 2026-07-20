import java.util.Scanner;

public class Java_1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[] arr = a.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("'" + arr[i] + "'");
        }
    }
}