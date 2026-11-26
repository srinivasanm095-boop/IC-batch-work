import java.util.TreeSet;

public class Hero30 {
    public static void main(String[] args) {

        TreeSet<String> a = new TreeSet<>();

        a.add("Java");
        a.add("Python");
        a.add("React");
        a.add("SQL");
        a.add("MongoDB");

        System.out.println("Available Skills: " + a);

        a.add("JavaScript");
        System.out.println("After Adding New Skill: " + a);

        a.add("Java");
        System.out.println("After Duplicate Skill: " + a);

        a.remove("SQL");
        System.out.println("After Removing Skill: " + a);

        System.out.println("Search Python: " + a.contains("Python"));

        System.out.println("First Skill: " + a.first());

        System.out.println("Last Skill: " + a.last());

        System.out.println("Skills in Descending Order: " + a.descendingSet());
    }
}