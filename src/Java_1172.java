import java.util.ArrayList;
import java.util.Scanner;

public class Java_1172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }
        list.sort(null);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
