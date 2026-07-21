import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        int m = Collections.max(list); // 가장 큰 값 찾아줌
        System.out.println(m);
    }
}