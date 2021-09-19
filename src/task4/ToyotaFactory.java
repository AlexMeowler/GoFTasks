package task4;

import java.util.Optional;

public class ToyotaFactory extends CarFactory {
    
    private static ToyotaFactory toyotaFactory;
    
    private ToyotaFactory() {

    }
    
    public static ToyotaFactory get() {
	return Optional.ofNullable(toyotaFactory)
		.orElseGet(() -> {
		    toyotaFactory = new ToyotaFactory();
		    return toyotaFactory;
		});
    }
    
    @Override
    public AbstractCar createCar() {
	return new ToyotaCar("Toyota");
    }

    @Override
    public AbstractEngine createEngine() {
	return new ToyotaEngine();
    }
}
