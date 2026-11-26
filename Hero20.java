import java.util.HashMap;

public class Hero20{
    public static void main(String[] args) {

        HashMap<String, String> a = new HashMap<>();

        a.put("Padmanadhan", "9876543210");
        a.put("Harsha", "9876543211");
        a.put("Fazil", "9876543212");
        a.put("Mushraf", "9876543213");

        System.out.println("Contact Details: " + a);

        a.put("Srinivas", "9876543214");
        System.out.println("After Adding Contact: " + a);

        a.put("Harsha", "9123456780");
        System.out.println("After Updating Number: " + a);

        System.out.println("Search Harsha: " + a.get("Harsha"));

        System.out.println("Check Fazil: " + a.containsKey("Fazil"));

        a.remove("Fazil");
        System.out.println("After Removing Contact: " + a);

        System.out.println("Check Phone Number: " + a.containsValue("9876543210"));

        System.out.println("All Contacts:");

        for (String i : a.keySet()) {
            System.out.println(i + " : " + a.get(i));
        }
    }
}