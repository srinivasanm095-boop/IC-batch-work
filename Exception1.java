import java.util.ArrayList;
public class Exception1 {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        System.out.println(num.get(0));
        num.remove(0);
        System.out.println(num);
    }
    }
