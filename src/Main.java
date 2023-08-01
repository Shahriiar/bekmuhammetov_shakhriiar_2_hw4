import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.next();
            a.add(name);
        }
        System.out.println(a);
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String name = scanner.next();
            b.add(name);
        }
        System.out.println(b);
        Collections.reverse(b);
        ArrayList<String> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println(c);

        c.sort(Comparator.comparing(String::length));
        System.out.println(c);
    }

}