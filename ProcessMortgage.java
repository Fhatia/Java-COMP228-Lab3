package excercise3;
import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgages[] mortgages = new Mortgages[3];

        System.out.println("Enter the current interest rate:");
        double rate = scanner.nextDouble();

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter mortgage type, 1 = Personal or 2 = Business:");
            int type = scanner.nextInt();

            System.out.println("Enter customer name:");
            String custName = scanner.next();

            System.out.println("Enter mortgage number:");
            String mortgageNum = scanner.next();

            System.out.println("Enter mortgage amount:");
            double mortgageAmount = scanner.nextDouble();

            System.out.println("Enter mortgage term, 1 = short, 3 = medium, 5 = long:");
            int term = scanner.nextInt();

            if (type == 1) {
                mortgages[i] = new PersonalMortgage(mortgageNum, custName, mortgageAmount, rate, term);
            }
            else if (type == 2) {
                mortgages[i] = new businessMortgage(mortgageNum, custName, mortgageAmount, rate, term);
            }

        }

        System.out.println("Your mortgage information:");
        for (Mortgages mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
        }
    }
}
