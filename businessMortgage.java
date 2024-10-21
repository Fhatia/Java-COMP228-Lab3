package excercise3;

public class businessMortgage extends Mortgages {
    
    public businessMortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate + 1, term);
        setInterestRate(interestRate);
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate + 1;
    }
}
