package task3;

public class AIDriverCompany extends TransportCompany {

    public AIDriverCompany(String name) {
	super(name);
    }

    @Override
    public TransportService create(String name, int category) {
	return new AIDriverService(name, category);
    }
}
