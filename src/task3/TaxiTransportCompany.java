package task3;

public class TaxiTransportCompany extends TransportCompany {

    public TaxiTransportCompany(String name) {
	super(name);
    }

    @Override
    public TransportService create(String name, int category) {
	return new TaxiService(name, category);
    }
    
}
