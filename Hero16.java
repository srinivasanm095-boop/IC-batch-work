
import java.util.LinkedHashSet;

public class Hero16 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a=new LinkedHashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println("All ID's:"+a);
        a.add(4);
        System.out.println("Adding of new Id's:"+a);
        a.add(3);
        System.out.println("Add a duplicate Id's:"+a);
        a.remove(4);
        System.out.println("Remove the Id's:"+a);
        System.out.print("ID's is availabel:"+a.contains(2));
        System.out.println("Total ID's size:"+a.size());
    }
    
}
