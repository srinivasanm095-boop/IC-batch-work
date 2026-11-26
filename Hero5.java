
import java.util.ArrayList;
public class Hero5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add("Zestify");
        b.add(1);
        a.add("SnapGo");
        b.add(2);
        a.add("CraveBox");
        b.add(3);
        for (String c : a) {
            System.out.println("Display All: " + c);
        }
        a.remove("SnapGo");
        b.remove(1);

        if (a.contains("CraveBox")) {
            System.out.println("CraveBox is available!");
        } else {
            System.out.println("CraveBox is unavailable!");
        }
        b.set(0, 5);
        int total = 0;
        for (int i = 0; i < b.size(); i++) {
            total = total + b.get(i);
        }
        System.out.println("Total: " + total);
        a.clear();
        b.clear();
        System.out.println("All clear: " + a);
    }
}
