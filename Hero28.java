import java.util.LinkedList;

public class Hero28 {
    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<>();

        a.add("Padmanadhan");
        a.add("Harsha");
        a.add("Fazil");
        a.add("Mushraf");

        System.out.println("Customer Queue: " + a);

        a.addFirst("Emergency Customer");
        System.out.println("After Adding Emergency Customer: " + a);

        a.addLast("Srinivas");
        System.out.println("After Adding New Customer: " + a);

        System.out.println("First Customer: " + a.peek());

        a.remove("Fazil");
        System.out.println("After Removing Customer: " + a);

        System.out.println("Next Customer to be Served: " + a.peek());

        System.out.println("Total Waiting Customers: " + a.size());

        System.out.println("Serving Customers:");

        while (!a.isEmpty()) {
            System.out.println("Serving: " + a.poll());
        }

        System.out.println("Remaining Customers: " + a);
        System.out.println("Queue Empty: " + a.isEmpty());
    }
}