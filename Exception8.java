
import java.util.LinkedHashMap;

public class Exception8 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students=new LinkedHashMap<>();
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
