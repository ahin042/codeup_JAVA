import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_1294 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("x", "a");
        m.put("y", "b");
        m.put("z", "c");
        m.put("a", "d");
        m.put("b", "e");
        m.put("c", "f");
        m.put("d", "g");
        m.put("e", "h");
        m.put("f", "i");
        m.put("g", "j");
        m.put("h", "k");
        m.put("i", "l");
        m.put("j", "m");
        m.put("k", "n");
        m.put("l", "o");
        m.put("m", "p");
        m.put("n", "q");
        m.put("o", "r");
        m.put("p", "s");
        m.put("q", "t");
        m.put("r", "u");
        m.put("s", "v");
        m.put("t", "w");
        m.put("u", "x");
        m.put("v", "y");
        m.put("w", "z");

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        StringBuilder a = new StringBuilder();
        for (char ch : n.toCharArray()) {
            if (ch == ' ') {
                a.append(" ");
            } else {
                a.append(m.get(String.valueOf(ch)));
            }
        }

        System.out.println(a);
    }
}
