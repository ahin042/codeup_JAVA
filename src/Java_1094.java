import java.util.ArrayList;
import java.util.Scanner;

public class Java_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int r = scanner.nextInt();
            list.add(r);
        }
        for (int i = list.toArray().length - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
