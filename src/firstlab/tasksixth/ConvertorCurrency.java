package firstlab.tasksixth;

public class ConvertorCurrency {
    public static void main(String[] args) {
        double amount = 15;
        String fromCurrency = "USD";
        String intoCurrency = "EUR";

        final double convertedAmount = convertCurrency(amount, fromCurrency, intoCurrency);

        System.out.printf("%.2f %s = %.2f %s", amount, fromCurrency, convertedAmount, intoCurrency);
    }

    private static double getExchangeRate(final String fromCurrency, final String intoCurrency) {
        switch (fromCurrency) {
            case "UAH":
                switch (intoCurrency) {
                    case "USD":
                        return 0.024;
                    case "CAD":
                        return 0.034;
                    case "EUR":
                        return 0.022;
                }
                break;
            case "USD":
                switch (intoCurrency) {
                    case "UAH":
                        return 41.53;
                    case "CAD":
                        return 1.39;
                    case "EUR":
                        return 0.93;
                }
                break;
            case "CAD":
                switch (intoCurrency) {
                    case "UAH":
                        return 29.83;
                    case "USD":
                        return 0.72;
                    case "EUR":
                        return 0.67;
                }
                break;
            case "EUR":
                switch (intoCurrency) {
                    case "UAH":
                        return 44.52;
                    case "USD":
                        return 1.07;
                    case "CAD":
                        return 1.49;
                }
                break;
        }
        return 0;
    }

    private static double convertCurrency(final double amount, final String fromCurrency, final String intoCurrency) {
        final double exchangeRate = getExchangeRate(fromCurrency, intoCurrency);
        if (exchangeRate == 0) {
            System.out.println("Invalid currency code.");
            return 0;
        }
        return amount * exchangeRate;
    }

}
