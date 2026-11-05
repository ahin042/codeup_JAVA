package Java_5000;

import java.util.Scanner;

public class Java_5079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        String str = sc.next();

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < v; i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            } else if (str.charAt(i) == 'B') {
                countB++;
            }
        }

        if (countA > countB) {
            System.out.println("A");
        } else if (countB > countA) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
