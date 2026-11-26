
import java.util.HashSet;
public class Hero9 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("Display Id list: " + a);
        a.add(4);
        System.out.println("After adding List: " + a);
        a.add(1);
        System.out.println("After adding the duplicate Id:"+a);
        a.remove(3);
        System.out.println("After removing from the list: " + a);
        if (a.contains(4)) {
            System.out.println("This ID  is available!");
        } else {
            System.out.println("This ID is not available!");
        }
        System.out.println("Display All registered ID:"+a);
        System.out.println(" Total number of size's are: " + a.size());
    }
}
