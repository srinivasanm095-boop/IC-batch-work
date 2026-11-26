import java.util.HashMap;

public class Hero25 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> a = new HashMap<>();

        a.put(101, 5000);
        a.put(102, 10000);
        a.put(103, 15000);

        System.out.println("Bank Account Details: " + a);

        a.put(104, 20000);
        System.out.println("After Creating Account: " + a);

        if (a.containsKey(101)) {
            int b = a.get(101);
            a.put(101, b + 2000);
            System.out.println("After Deposit: " + a.get(101));
        } else {
            System.out.println("Account Not Found");
        }

        if (a.containsKey(102)) {
            int b = a.get(102);
            a.put(102, b - 3000);
            System.out.println("After Withdrawal: " + a.get(102));
        } else {
            System.out.println("Account Not Found");
        }

        System.out.println("Balance of Account 103: " + a.get(103));

        if (a.containsKey(105)) {
            System.out.println("Account Found");
        } else {
            System.out.println("Account 105 Not Found");
        }

        System.out.println("All Account Details:");

        for (var i : a.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        int total = 0;

        for (int i : a.values()) {
            total = total + i;
        }

        System.out.println("Total Bank Balance: " + total);
    }
}