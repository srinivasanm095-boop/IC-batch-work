
import java.util.HashSet;
public class Hero11 {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("Nexora");
        a.add("voltaic");
        a.add("synapse");
        System.out.println("Display product list: " + a);
        a.add("quibt");
        System.out.println("After adding product List: " + a);
        a.add("voltaic");
        System.out.println("After adding the duplicate product:"+a);
        a.remove("synapse");
        System.out.println("After removing from the product list: " + a);
        if (a.contains("Nexora")) {
            System.out.println("This product  is available!");
        } else {
            System.out.println("This product  is not available!");
        }
        System.out.println("Display All unique  product:"+a);
        System.out.println(" Total number of unique product are: " + a.size());
    }
}
