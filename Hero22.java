import java.util.TreeMap;
public class Hero22 {
    public static void main(String[] args) {
        TreeMap<String, String> a = new TreeMap<>();
        a.put("24HR1A05E8", "99");
        a.put("24HR1A05E7", "100");
        a.put("24HR1A05E9", "100");
        a.put("24HR1A05E10", "100");
        System.out.println("Student Details: " + a);
        a.put("24HR1A05E7", "101");
        System.out.println("After Updating Marks: " + a);
        int max = 0;
        int min = 1000;
        for (String i : a.values()) {
            int marks = Integer.parseInt(i);
            if (marks > max) {
                max = marks;
            }
            if (marks < min) {
                min = marks;
            }
        }
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("First Entry: " + a.firstEntry());
        System.out.println("Last Entry: " + a.lastEntry());
        System.out.println("Students from E7 to E10: " + a.subMap("24HR1A05E7", true, "24HR1A05E10", true));
        System.out.println("Reverse Roll Number Order: " + a.descendingMap());
    }
}