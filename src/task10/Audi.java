package task10;

public class Audi extends AutoBase {
    
    public Audi(String name, String description, double costBase) {
	super(name, description, costBase);
    }	

    @Override
    public double getTotalCost() {
	return getCostBase() * 1.1;
    }

}
