import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        //Create instance of scanner to get user info
        Scanner myScanner = new Scanner(System.in);

        //region Ask user for data and store in variables
        System.out.println("What is the principal(original amount borrowed) of your loan? ");
        double principal = myScanner.nextDouble();

        System.out.println("What is the interest rate percentage of your loan? ");
        double interestRate = myScanner.nextDouble();

        System.out.println("What is the length of your loan (in years)? ");
        double loanLength = myScanner.nextDouble();
        //endregion

        // Find how many monthly payments
        double totalMonthlyPayments = loanLength * 12;
        // Convert interestRate to monthly interest rate
        double monthlyInterestRate = (interestRate / 100) / 12;

        // Calculate monthly payments: M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        double monthlyPayments = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) / (Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) - 1));
        // Calculate total interest: Total Interest = Principal x Interest Rate x Time (in years)
        double totalInterestPaid = principal * interestRate * loanLength;

        // Print out user's monthly payments and their total interest paid
        System.out.println("\nYour monthly payment: \n" + "$" + monthlyPayments);
        System.out.println("Your total interest paid: \n" + "$" + totalInterestPaid);

    }
}
