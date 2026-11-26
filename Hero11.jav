
import java.util.ArrayList;
import java.util.Collections;
public class Hero11 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        a.add(500);
        a.add(600);
        a.add(700);
        a.add(800);
        a.add(900);
        a.add(1000);
        System.out.println("Display All Prices: " + a);
        a.set(2, 350);
        System.out.println("After Updating Price: " + a);
        System.out.println("Highest Price: " + Collections.max(a));
        System.out.printn("Lowest Price: " + Collections.min(a));
        int total = 0;
        for (int i = 0; i < a.size(); i++) {
            total = total + a.get(i);
        }
        System.out.println("Average Price: " + (total / a.size()));
        Collections.sort(a);
        System.out.println("Ascending Order: " + a);
        System.out.println("Prices Between 300 and 800:");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 300 && a.get(i) <= 800) {
                System.out.println(a.get(i));
            }
        }
    }
}
