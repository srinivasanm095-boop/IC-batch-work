import java.util.HashMap;
public class Hero17 {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Padmanadhan", 85);
        a.put("Harsha", 90);
        a.put("Fazil", 75);
        a.put("Mushraf", 80);
        System.out.println("Student Records: " + a);
        a.put("Srinivas", 95);
        System.out.println("After Adding Student: " + a);
        a.put("Harsha", 95);
        System.out.println("After Updating Harsha Marks: " + a);
        System.out.println("Harsha Marks: " + a.get("Harsha"));
        System.out.println("Check Fazil: " + a.containsKey("Fazil"));
        a.remove("Fazil");
        System.out.println("After Removing Student: " + a);
        System.out.println("All Student Names and Marks:");
        for (String name : a.keySet()) {
            System.out.println(name + " : " + a.get(name));
        }
        int sum = 0;
        for (int marks : a.values()) {
            sum = sum + marks;
        }
        double average = (double) sum / a.size();
        System.out.println("Average Marks: " + average);
    }
}