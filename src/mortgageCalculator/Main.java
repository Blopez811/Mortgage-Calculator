package mortgageCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("The principal is " + principal);
        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();
        System.out.println("Here dat interest rate: " + interestRate);
    }
}