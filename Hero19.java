import java.util.HashMap;
public class Hero19{
    public static void main(String[] args) {
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(101, 10);
        a.put(102, 8);
        a.put(103, 4);
        a.put(104, 2);
        System.out.println("Product Details: " + a);
        a.put(105, 15);
        System.out.println("After Adding Product: " + a);
        a.put(102, 12);
        System.out.println("After Updating Quantity: " + a);
        int b = a.getOrDefault(101, 0);
        a.put(101, b - 3);
        System.out.println("After Selling Product: " + a);
        System.out.println("Search Product 102: " + a.get(102));
        System.out.println("Products Below 5 Quantity:");
        for (int i : a.keySet()) {
            if (a.get(i) < 5) {
                System.out.println(i + " : " + a.get(i));
            }
        }
        a.remove(104);
        System.out.println("After Removing Product: " + a);
    }
}