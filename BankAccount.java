class Account {
    private double balance;
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public double getBalance() {
        return this.balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        account.deposit(1000.0);
        account.withdraw(-200.0);
        System.out.println("Final balance: " + account.getBalance());
    }
}
