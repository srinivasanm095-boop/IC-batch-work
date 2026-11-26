import java.util.HashSet;

public class Exception3 {
    public static void main(String[] args){
        HashSet<String> courses=new HashSet<>();
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
