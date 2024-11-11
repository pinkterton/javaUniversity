package firstlab.taskseventh;

public class TransferApp {
    public static void main(String[] args) {
        Bank bank1 = new Bank("PrivatBank");
        Bank bank2 = new Bank("MonoBank");

        BankAccount account1 = new BankAccount("Ivan", "USD", 3999);
        BankAccount account2 = new BankAccount("Sasha", "EUR", 500);

        System.out.println("Before Transfer:");
        System.out.println("Account 1 Balance: " + account1.getBalance() + " " + account1.getCurrency());
        System.out.println("Account 2 Balance: " + account2.getBalance() + " " + account2.getCurrency());

        bank1.transferMoney(account1, account2, 500);


        System.out.println("After Transfer:");
        System.out.println("Account 1 Balance: " + account1.getBalance() + " " + account1.getCurrency());
        System.out.println("Account 2 Balance: " + account2.getBalance() + " " + account2.getCurrency());
    }
}
