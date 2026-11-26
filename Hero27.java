public import java.util.ArrayList;
import java.util.Collections;

public class Hero27 {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("Java");
        a.add("Python");
        a.add("C Programming");
        a.add("HTML");
        a.add("JavaScript");

        System.out.println("Library Books: " + a);

        a.add("SQL");
        System.out.println("After Adding New Book: " + a);

        a.remove("HTML");
        System.out.println("After Removing Book: " + a);

        a.set(1, "Advanced Python");
        System.out.println("After Updating Book: " + a);

        System.out.println("Search Java: " + a.contains("Java"));

        System.out.println("All Available Books:");

        for (String i : a) {
            System.out.println(i);
        }

        System.out.println("Total Number of Books: " + a.size());

        Collections.reverse(a);

        System.out.println("Books in Reverse Order: " + a);
    }
} 
