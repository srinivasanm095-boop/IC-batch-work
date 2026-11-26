import java.util.LinkedHashSet;

public class Hero31 {
    public static void main(String[] args) {

        LinkedHashSet<String> a = new LinkedHashSet<>();

        a.add("Laptop");
        a.add("Mobile");
        a.add("Keyboard");
        a.add("Mouse");
        a.add("Headphones");

        System.out.println("Recently Viewed Products: " + a);

        a.add("Smart Watch");
        System.out.println("After Adding New Product: " + a);

        a.add("Laptop");
        System.out.println("After Duplicate Product: " + a);

        System.out.println("Search Mobile: " + a.contains("Mobile"));

        a.remove("Keyboard");
        System.out.println("After Removing Product: " + a);

        System.out.println("Total Unique Viewed Products: " + a.size());

        System.out.println("Recently Viewed Products in Order:");
        for (String i : a) {
            System.out.println(i);
        }
    }
}