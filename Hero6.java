
import java.util.ArrayList;
import java.util.Collections;

public class Hero6 {
    public static  void main(String[] args){
        ArrayList<String> a=new ArrayList<>();
        a.add("Hero1");
        a.add("Hero2");
        a.add("Hero3");
        a.add("Hero4");
        a.add("Hero5");
        for(String b:a){
            System.out.println("Display the present list:"+b);
        }
        a.add("Hero6");
        System.out.println("After adding the new present list:"+a);
        a.remove("Hero3");
        System.out.println("Remove the absent memeber:"+a);
        if(a.contains("Hero2")){
            System.out.println("This member is having");
        }
        else{
            System.out.println("This memeber is not having");
        }
        System.out.println("Display the total number number of present memebers:"+a.size());
        Collections.reverse(a);
        System.out.println("Reverse the list:"+a);

    }
    
}