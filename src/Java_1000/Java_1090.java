package Java_1000;

import java.util.Scanner;

public class Java_1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        for (int i = 0; i < c - 1; i++) {
            a *= b;
        }
        System.out.println(a);
    }
}
