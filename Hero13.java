
import java.util.TreeSet;

public class Hero13 {
    public static void main(String[] args) {

        TreeSet<Integer> a = new TreeSet<>();

        a.add(85);
        a.add(90);
        a.add(75);
        a.add(95);
        a.add(80);
        a.add(90);

        System.out.println("Display All Scores: " + a);

        System.out.println("Highest Score: " + a.last());

        System.out.println("Lowest Score: " + a.first());

        System.out.println("Higher Score of 85: " + a.higher(85));

        System.out.println("Lower Score of 85: " + a.lower(85));

        System.out.println("Descending Order: " + a.descendingSet());
    }
}
