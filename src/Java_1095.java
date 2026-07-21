import java.util.Scanner;
import java.util.ArrayList;

public class Java_1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int r = scanner.nextInt();
            list.add(r);
        }
        list.sort(null);
        System.out.println(list.get(0));
    }
}
