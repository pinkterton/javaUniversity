package firstlab.taskseventh;

public class Bank {
    private final String bankName;
    private final double usdToEurRate = 0.93;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency))
            return amount;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return amount * usdToEurRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount / usdToEurRate;
        }

        System.out.println("Currency conversion not supported.");
        return 0;
    }

    public double calculateCommission(double amount, String fromAccountHolder, String toAccountHolder, boolean sameBank) {
        if (sameBank) {
            if (fromAccountHolder.equals(toAccountHolder))
                return 0;
            else
                return 3;

        } else {
            if (fromAccountHolder.equals(toAccountHolder))
                return 0;
            else
                return 6;

        }
    }

    public void transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
        double convertedAmount = convertCurrency(amount, fromAccount.getCurrency(), toAccount.getCurrency());

        double commissionRate = calculateCommission(amount, fromAccount.getAccountHolder(), toAccount.getAccountHolder(), fromAccount.equals(toAccount));

        fromAccount.transferTo(toAccount, convertedAmount, commissionRate);
    }
}

