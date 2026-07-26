import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_1752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String a = scanner.next();
        int c = a.length();
        for (int i = 0; i < c; i++) {
            list.add(a.charAt(i) + "");
        }
        Collections.reverse(list);
        // Collections.reverse() : 반환값 없이 원본 리스트를 직접 뒤집어줌
        for (String i : list) {
            System.out.print(i);
        }
    }
}
