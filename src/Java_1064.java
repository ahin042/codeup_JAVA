import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        int m = Collections.min(list);
        System.out.println(m);
    }
}
