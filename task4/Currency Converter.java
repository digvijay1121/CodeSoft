import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Static exchange rates (for demonstration purposes)
        double usdToInr = 82.0; // Example rate
        double eurToInr = 90.0; // Example rate
        double inrToUsd = 0.0122;
        double inrToEur = 0.0111;
        
        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. USD to INR");
        System.out.println("4. EUR to INR");
        System.out.print("Choose the conversion type: ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0.0;
        
        switch (choice) {
            case 1 -> convertedAmount = amount * inrToUsd;
            case 2 -> convertedAmount = amount * inrToEur;
            case 3 -> convertedAmount = amount * usdToInr;
            case 4 -> convertedAmount = amount * eurToInr;
            default -> System.out.println("Invalid choice!");
        }
        
        if (convertedAmount > 0) {
            System.out.println("Converted Amount: " + convertedAmount);
        }
    }
}
