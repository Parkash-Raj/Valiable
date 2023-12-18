import java.util.*;
class CurrencyConverter {
     static final Map<String, Double> exchangeRates = new HashMap<>();

    static {

        exchangeRates.put("PKR", 1.0);
        exchangeRates.put("USD", 0.003567);
        exchangeRates.put("GBP", 0.73);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CURRENCY CONVERTER");


        System.out.println("Available Currencies:");
        for (String currency : exchangeRates.keySet()) {
            System.out.print(currency + " ");
        }
        System.out.println();


        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.next().toUpperCase();


        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.next().toUpperCase();


        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();


        if (exchangeRates.containsKey(baseCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double exchangeRate = exchangeRates.get(targetCurrency) / exchangeRates.get(baseCurrency);
            double convertedAmount = amount * exchangeRate;


            System.out.println("\nCONVERSION RESULT:");
            System.out.println("Amount in " + baseCurrency + ": " + amount);
            System.out.println("Converted Amount in " + targetCurrency + ": " + convertedAmount);
        } else {
            System.out.println("Invalid currencies. Please choose from the available currencies.");
        }


    }
}
