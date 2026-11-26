
import java.util.TreeMap;

public class Exception7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students=new TreeMap<>();
        students.put(100,"mushraf");
        students.put(10,"padmanadhan");
        students.put(9,"gowri");
        System.out.println(students);
        System.out.println("Students 100:"+students.get(100));
        students.put(10, "hero");
        students.remove(103);
        System.out.println("updated Map:"+students);


    }
}
