import java.util.TreeMap;

public class Hero26 {
    public static void main(String[] args) {

        TreeMap<Integer, String> a = new TreeMap<>();

        a.put(105, "HR");
        a.put(102, "CSE");
        a.put(104, "ECE");
        a.put(101, "IT");

        System.out.println("Employee Details: " + a);

        a.put(103, "Mechanical");
        System.out.println("After Adding Employee: " + a);

        a.put(102, "Java");
        System.out.println("After Updating Department: " + a);

        System.out.println("Search Employee 102: " + a.get(102));

        System.out.println("Check Employee 104: " + a.containsKey(104));

        a.remove(104);
        System.out.println("After Removing Employee: " + a);

        System.out.println("First Employee ID: " + a.firstKey());

        System.out.println("Last Employee ID: " + a.lastKey());

        System.out.println("Ascending Order: " + a);

        System.out.println("Descending Order: " + a.descendingMap());

        System.out.println("Employees from ID 102 to 105: "
                + a.subMap(102, true, 105, true));
    }
}