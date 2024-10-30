import java.util.Scanner;

public class VotingApp
{
    public static void main(String[] args) {
        String decision = "YES";

        String[] rulingParties = {"ANC", "DA", "EFF", "COPE", "IFP", "ATM"};
        for (int i = 0; i < rulingParties.length; i++) {
            System.out.println(rulingParties[i]);
        }

        // create a scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt the user for input
        System.out.print("Select the party of your choice: ");
        // read the input
        String name = scanner.nextLine();
        String upperCase = name.toUpperCase();
        // print the input
        System.out.println("Is" + " " + upperCase + " " + "the party you chose??: ");

        scanner.close();
//        static String RightChoice (String name)
//        {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print(" ");
//            String choice = scanner.nextline();
//            scanner.close();
//        }
    }
}