package excercise2;

public abstract class GameTester {
    public String name;
    public boolean fullTime;

    public GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public abstract double testerSalary();

}

class FullTimeGT extends GameTester {

    public FullTimeGT(String name) {
        super(name, true);
    }

    public double testerSalary() {
        return 3000.00;
    }

}

class PartTimeGT extends GameTester {
    private int partTimeHours;

    public PartTimeGT(String name, int partTimeHours) {
        super(name, false);
        this.partTimeHours = partTimeHours;
    }

    public double testerSalary() {
        return partTimeHours * 20;
    }
}
