import java.util.Scanner;

public class Java_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String[] lst = a.split("\\.");
        System.out.printf("%04d", Integer.parseInt(lst[0]));  // 문자열을 정수(int)로 변환
        for (int i = 1; i < lst.length; i ++) {
            System.out.printf(".%02d", Integer.parseInt(lst[i]));
        }
    }
}
