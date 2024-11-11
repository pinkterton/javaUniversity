package firstlab.taskseventh;

public class BankAccount {
    private final String accountHolder;
    private final String currency;
    private double balance;

    public BankAccount(String accountHolder, String currency, double initialBalance) {
        this.accountHolder = accountHolder;
        this.currency = currency;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void transferTo(BankAccount target, double amount, double commissionRate) {
        double amountWithCommission = amount + amount * commissionRate / 100;
        if (this.withdraw(amountWithCommission))
            target.deposit(amount);
        else
            System.out.println("Insufficient funds for the transfer.");
    }
}
