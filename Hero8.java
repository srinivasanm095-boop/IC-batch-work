
import java.util.LinkedList;
public class Hero8 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("www.google.com");
        a.add("ww.instagram.com");
        a.add("www.whatweb.com");
        System.out.println("Display website list: " + a);
        a.add("www.laptop.com");
        System.out.println("After adding first website: " + a);
        a.addLast("www.mobile.com");
        System.out.println("After adding last website: " + a);
        System.out.println("First website: " + a.getFirst());
        System.out.println("Last website: " + a.getLast());
        if (a.contains("www.whatweb.com")) {
            System.out.println("This website  is available!");
        } else {
            System.out.println("This website is not available!");
        }
        a.clear();
        System.out.println("After clearing all history: " + a);
    }
}
