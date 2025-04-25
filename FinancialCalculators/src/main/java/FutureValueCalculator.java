import java.util.Scanner;

public class FutureValueCalculator {

    public static void main(String[] args) {

        //Get user input and store in variables
        double initialDeposit = getUserInput("What is your initial deposit? ");
        double interestRate = getUserInput("What is your annual interest rate? ");
        double numberOfYears = getUserInput("How many years will your deposit earn interest? ");

        //Get interest rate in decimal
        double decimalIR = interestRate / 100;

        //FV = P * (1 +(r / 365))^(365 * t)
        //Calculate future value
        double futureValue = initialDeposit * (Math.pow(1 + (decimalIR / 365), (365 * numberOfYears)));
        //Calculate the amount of interest
        double totalInterestEarned = futureValue - initialDeposit;

        //print out future value and interest earned
        System.out.printf("The Future Value for your CD: $%.2f \nThe total interest earned on your CD is: $%.2f", futureValue, totalInterestEarned);
    }

    //Method that takes a message, shows it to user, and gets user input
    static double getUserInput(String message) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = myScanner.nextLine();
        return Double.parseDouble(userInput);
    }
}
