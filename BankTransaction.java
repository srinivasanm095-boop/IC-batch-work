public class BankTransaction {
    int balance = 10000;
    void withdraw(String amount) {
        try {
            int withdrawAmount = Integer.parseInt(amount);
            if (withdrawAmount <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }
            if (withdrawAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance = balance - withdrawAmount;
            System.out.println("Remaining balance:" + balance);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid amount format");
        }
        catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Insufficient balance")) {
                System.out.println("Insufficient balance");
            }
            else {
                System.out.println("Invalid withdrawal amount");
            }
        }
    }
    public static void main(String[] args) {
        BankTransaction obj = new BankTransaction();
        obj.withdraw("2000");
        obj.withdraw("15000");
        obj.withdraw("abc");
        obj.withdraw("-500");
        obj.withdraw("0");
    }
}