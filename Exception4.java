import java.util.TreeSet;

public class Exception4{
    public static void main(String[] args){
        TreeSet<String> courses=new TreeSet<>();
        courses.add("Java");
        courses.add("python");
        courses.add("React");
        courses.add("Java");
        System.out.println(courses);
        System.out.println("contains java:"+courses.contains("java"));
        courses.remove("python");
        System.out.println("After removal:"+courses);

    }
    
}
