import java.util.ArrayList;
import java.util.Scanner;

public class Java_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String a = "a";
        while (true) {
            if (a.equals("q")) {
                break;
            }
            a = scanner.next();
            list.add(a);
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
