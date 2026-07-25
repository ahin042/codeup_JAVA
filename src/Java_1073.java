import java.util.ArrayList;
import java.util.Scanner;

public class Java_1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = 10;
        while (a != 0) {
            a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            list.add(a);
        }
        for(int i : list) {
            System.out.println(i);
        }
    }
}
