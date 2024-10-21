package excercise3;

public abstract class Mortgages implements MortgageConstants{
    private String mortgageNumber;
    private String customerName;
    public double amount;
    public double interestRate;
    public int term;

    public Mortgages(String mortgageNumber, String customerName, double amount, double interestRate, int term){
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.interestRate = interestRate;

        if (amount > maxAmount) {
            this.amount = maxAmount;
        }
        else {
            this.amount = amount;
        }
    }

    public abstract void setInterestRate(double interestRate);

    public double amountOwed(){
        return amount + (amount * term *(interestRate/100));
    }

    public String getMortgageInfo() {
        return "Mortgage number: " + mortgageNumber + " Customer name: " + customerName + " Amount: " + amount + " Interest rate: " + interestRate + " Term: " + term + " Amount owed: " + amountOwed();
    }
}

