
import java.util.LinkedList;
public class Hero7 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Song1");
        a.add("Song2");
        a.add("Song3");
        a.add("Song4");
        System.out.println("Display Playlist: " + a);
        a.addFirst("Song0");
        System.out.println("After adding first song: " + a);
        a.addLast("Song5");
        System.out.println("After adding last song: " + a);
        System.out.println("First Song: " + a.getFirst());
        System.out.println("Last Song: " + a.getLast());
        a.removeFirst();
        System.out.println("After removing first song: " + a);
        a.removeLast();
        System.out.println("After removing last song: " + a);
        if (a.contains("Song2")) {
            System.out.println("Song2 is available!");
        } else {
            System.out.println("Song2 is not available!");
        }
        System.out.println("Playing Song: " + a.getFirst());
        a.removeFirst();
        System.out.println("After playing song: " + a);
    }
}
