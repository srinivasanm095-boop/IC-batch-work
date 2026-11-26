import java.util.LinkedHashSet;

public class Exception5{
    public static void main(String[] args){
        LinkedHashSet<String> courses=new LinkedHashSet<>();
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
