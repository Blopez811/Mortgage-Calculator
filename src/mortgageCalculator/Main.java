package mortgageCalculator;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        float monthlyInterestRate = annualInterestRate / 100 / 12;
        int payments = period * 12;
        double mortgage = principal * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), payments)) / (Math.pow((1 + monthlyInterestRate), payments) - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.print("Mortgage: " + result);
    }
}