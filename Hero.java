import java.util.ArrayList;
import java.util.Scanner;

public class Hero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        a.add("hero1");
        a.add("hero2");
        a.add("hero3");
        a.add("hero4");
        a.add("hero5");
        a.add("hero6");
        System.out.println("display all the students Names:");
        for(String Name:a){
            System.out.println(Name);

        }
        a.add(2,"Hero7");
        System.out.println("After adding the new students:"+a);
        a.remove("hero4");
        System.out.println("After removing of hero4:"+a);
        a.add(5,"hero9");
        System.out.println("After updating the details:"+a);
        if (a.contains("hero5")) {
            System.out.println("hero5 is availble in given list ");
            
        }
        else{
            System.out.println("hero5 is not availble in given list");
        }
        System.out.println("In the given names how many no of students size:"+a.size());
        for(String name:a){
            System.out.println(name);
        }



    }
    
}
