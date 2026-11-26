import java.util.LinkedList;
public class Exception2 {
    public static void main(String[] args){
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("learn java");
        tasks.add("learn Sql");
        tasks.add("learn React");
        tasks.addFirst("start Train");
        tasks.addLast("Build Project");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After removal:"+tasks);
    }
    
}
