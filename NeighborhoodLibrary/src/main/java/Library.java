public class Library {
    /*
    • The Store Home Screen - The home screen should display a list
of options that a user can choose from.
o Show Available Books
o Show Checked Out Books
o Exit - closes out of the application
• Show Available Books - Displays a list of all books that are not
currently checked out. Display the Id, ISBN and Title of the book.
o Prompt the user to either select a book to check out, or exit to
go back to the home screen
o If the user wants to check out a book, prompt them for their
name
o Then check out the book
• Show Checked Out books - This displays a list of all the books
that are currently checked out. Display the Id, ISBN, Title and
Name of the person who has the book checked out. Prompt the
user to
o C - to Check In a book
o X - to go back to the home screen
• Check In a book - Prompt the user for the ID of the book they
want to check in.
o Check in the book with the specified id
o Go back to the home screen
     */

    public static void main(String[] args) {

        System.out.println("\t\t=======WELCOME TO THE NEIGHBORHOOD LIBRARY=======");
        System.out.println("\n\t=======HOME SCREEN=======");

        boolean ifContinue = true;

        while (ifContinue) {
            System.out.println("OPTIONS:\n1 - Show Available Books\n2 - Show Checked Out Books\n3 - Exit");
            int userAction = Integer.parseInt(Utils.getUserInput("Enter a number: "));

            switch (userAction) {
                case 1 -> showAvailableBooks();
                case 2 -> showCheckedOutBooks();
                case 3 -> {
                    System.out.println("Thank You for using the Neighborhood Library. Goodbye!");
                    ifContinue = false;
                }
                default -> System.err.println("ERROR! Please Enter a number 1 - 3!");
            }
        }
    }

    public static void showAvailableBooks () {
        System.out.println("Available Books");
    }

    public static void showCheckedOutBooks() {
        System.out.println("Checked Out Books");
    }

}
