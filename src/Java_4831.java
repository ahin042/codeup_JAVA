import java.util.Scanner;

public class Java_4831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int car = sc.nextInt();
            if (car == date) count++;
        }
        System.out.println(count);
    }
}
