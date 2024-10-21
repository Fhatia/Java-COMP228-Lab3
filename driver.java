package excercise2;
import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the game tester's name:");
        String name = scanner.nextLine();

        System.out.println("Is the game tester full time or part time?");
        String choice = scanner.nextLine();
        
        GameTester tester = null;
        
        if (choice.equals("full time")) {
            tester = new FullTimeGT(name);
        }
        else if (choice.equals("part time")) {
            System.out.println("Enter # of hours worked:");
            int hours = scanner.nextInt();
            tester = new PartTimeGT(name, hours);
        }

        System.out.println("Game tester's name: " + name);
        System.out.println("Salary:" + tester.testerSalary());
        
    }
}
