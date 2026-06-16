import java.util.Scanner;

public class Java_1410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int c1 = 0;
        int c2 = 0;
        for (char i : a.toCharArray()) {
            if (i == '(') {
                c1 += 1;
            } else {
                c2 += 1;
            }
        }
        System.out.print(c1 + " " + c2);
    }
}