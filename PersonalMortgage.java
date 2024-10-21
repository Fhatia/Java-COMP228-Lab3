package excercise3;

public class PersonalMortgage extends Mortgages {
    
    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate + 2, term);
        setInterestRate(interestRate);
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate + 2;
    }
}
