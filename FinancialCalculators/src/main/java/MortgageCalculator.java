import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        //region Ask user for data and store in variables
        double principal = getUserInput("What is the principal(original amount borrowed) of your loan? ");
        double interestRate = getUserInput("What is the interest rate percentage of your loan? ");
        double loanLength = getUserInput("What is the length of your loan (in years)? ");
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
        System.out.printf("Your monthly payment: \n" + "$%.2f%n", monthlyPayments);
        System.out.printf("Your total interest paid: \n" + "$%.2f", totalInterestPaid);
    }

    //method for getting user input
    public static double getUserInput(String message){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = myScanner.nextLine();
        return Double.parseDouble(userInput);
    }
}
