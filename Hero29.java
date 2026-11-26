import java.util.HashSet;

public class Hero29 {
    public static void main(String[] args) {

        HashSet<Integer> a = new HashSet<>();

        a.add(101);
        a.add(102);
        a.add(103);
        a.add(104);

        System.out.println("Event 1 Registrations: " + a);

        a.add(105);
        System.out.println("After Adding Student: " + a);

        a.add(102);
        System.out.println("After Duplicate Registration: " + a);

        a.remove(103);
        System.out.println("After Cancelling Registration: " + a);

        System.out.println("Search Student 102: " + a.contains(102));

        System.out.println("Total Registrations: " + a.size());

        HashSet<Integer> b = new HashSet<>();

        b.add(102);
        b.add(104);
        b.add(105);
        b.add(106);

        System.out.println("Event 2 Registrations: " + b);

        HashSet<Integer> c = new HashSet<>(a);

        c.retainAll(b);

        System.out.println("Students Registered for Both Events: " + c);

        HashSet<Integer> d = new HashSet<>(a);

        d.addAll(b);

        System.out.println("All Unique Registrations: " + d);

        System.out.println("Total Unique Students: " + d.size());
    }
}