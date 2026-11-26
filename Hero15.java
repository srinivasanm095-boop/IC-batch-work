
import java.util.LinkedHashSet;

public class Hero15 {
    public static void main(String[] args) {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hero1");
        a.add("hero2");
        a.add("hero3");
        System.out.println("All contacts:"+a);
        a.add("hero4");
        System.out.println("Adding of new contact:"+a);
        a.add("hero1");
        System.out.println("Add a duplicate contact:"+a);
        a.remove("hero1");
        System.out.println("Remove the contact:"+a);
        if(a.contains("hero2")){
            System.out.println("hero2 contact is availble!");
        }
        else{
            System.out.println("This contact is not availble");
        }
        System.out.println("Total contact:"+a);
    }
    
}
