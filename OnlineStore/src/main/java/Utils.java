import java.util.Scanner;

public class Utils {

    public static String filePath = "Online-Store/src/main/resources/products.csv";

    static Scanner myScanner = new Scanner(System.in);

    static String getUserInput(String message) {
        System.out.println(message);
        return myScanner.nextLine();
    }

    public static void pauseApp() {
        System.out.println("\n Please press enter to continue...");
        myScanner.nextLine();
    }

    public static void designLine(int numberOfLines, boolean isNewLine) {
        StringBuilder underLine = new StringBuilder("=");

        for (int i = 0; i < numberOfLines; i++) {
            underLine.append("=");
        }
        if (isNewLine) {
            underLine.append("\n");
        }
        System.out.println(underLine);
    }
}