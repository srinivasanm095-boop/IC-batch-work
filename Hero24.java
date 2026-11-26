import java.util.LinkedHashMap;

public class Hero24 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();

        a.put("Laptop", 10);
        a.put("Mobile", 15);
        a.put("Keyboard", 8);
        a.put("Mouse", 12);

        System.out.println("Sales Details: " + a);

        a.put("Monitor", 20);
        System.out.println("After Adding Product: " + a);

        a.put("Mobile", 25);
        System.out.println("After Updating Sales: " + a);

        System.out.println("All Products and Sales:");

        for (String i : a.keySet()) {
            System.out.println(i + " : " + a.get(i));
        }

        int total = 0;

        for (int i : a.values()) {
            total = total + i;
        }

        System.out.println("Total Products Sold: " + total);

        int max = 0;
        String product = "";

        for (var i : a.entrySet()) {
            if (i.getValue() > max) {
                max = i.getValue();
                product = i.getKey();
            }
        }

        System.out.println("Highest Sales Product: " + product);
        System.out.println("Highest Sales Quantity: " + max);

        System.out.println("Sales Report in Insertion Order:");

        for (var i : a.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}