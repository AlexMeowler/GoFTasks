package task10;

public class Renault extends AutoBase {

    public Renault(String name, String description, double costBase) {
	super(name, description, costBase);
    }

    @Override
    public double getTotalCost() {
	return getCostBase() * 1.18;
    }

}
