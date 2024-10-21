public abstract class Insurance {
    public String insuranceName;
    public double monthlyCost;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract void setMonthlyCost(double monthlyCost);
    public abstract void displayInfo();

}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    public void setMonthlyCost(double monthlyCost) {
        super.monthlyCost = monthlyCost;
    }

    public void displayInfo() {
        System.out.println("Insurance Name: " + getInsuranceName());
        System.out.println("Monthly Cost: " + getMonthlyCost());
    }
}

class Life extends Insurance {

    public Life(String insuranceName) {
        super(insuranceName);
    }

    public void setMonthlyCost(double monthlyCost) {
        super.monthlyCost = monthlyCost;
    }

    public void displayInfo() {
        System.out.println("Insurance Name: " + getInsuranceName());
        System.out.println("Monthly Cost: " + getMonthlyCost());
    }
}
