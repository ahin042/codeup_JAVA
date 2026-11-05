package Java_1200;

import java.util.Scanner;

public class Java_1280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sb.append("+").append(i);
                sum += i;
            } else {
                sb.append("-").append(i);
                sum -= i;
            }
        }

        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}
