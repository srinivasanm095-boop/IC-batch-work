import java.util.TreeMap;

public class Hero21 {
    public static void main(String[] args) {

        TreeMap<Integer, String> a = new TreeMap<>();

        a.put(105, "Padmanadhan");
        a.put(102, "Harsha");
        a.put(104, "Fazil");
        a.put(101, "Mushraf");

        System.out.println("Student Records: " + a);

        a.put(103, "Srinivas");
        System.out.println("After Adding Student: " + a);

        a.put(102, "Ramesh");
        System.out.println("After Updating Name: " + a);

        System.out.println("Search Roll Number 102: " + a.get(102));

        a.remove(104);
        System.out.println("After Removing Student: " + a);

        System.out.println("First Roll Number: " + a.firstKey());

        System.out.println("Last Roll Number: " + a.lastKey());

        System.out.println("Ascending Order: " + a);

        System.out.println("Descending Order: " + a.descendingMap());

        System.out.println("Student Records from 102 to 105: " + a.subMap(102, true, 105, true));
    }
}