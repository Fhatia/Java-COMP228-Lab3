import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Insurance[] insurances = new Insurance[10];
        int count = 0;

        while (count < 10) {
            System.out.println("Enter Insurance Type (health or life) or 'exit' to exit: ");
            String type = scanner.nextLine();

            if (type.equals("exit")) {
                break;
            }

            Insurance insurance = null;

            if (type.equals("Health")) {
                insurance = new Health("Health Insurance");
            } else if (type.equals("Life")) {
                insurance = new Life("Life Insurance");
            } else {
                System.out.println("Error, please choose Health or Life");
                return;
            }

            System.out.println("Enter monthly cost:");
            double cost = scanner.nextDouble();
            scanner.nextLine();

            insurance.setMonthlyCost(cost);
            insurances[count] = insurance;
            count++;

        }
        System.out.println("Your Insurance Information:");
        for (int i = 0; i < count; i++) {
            insurances[i].displayInfo();
        }

    }
}
