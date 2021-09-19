package task4;

import java.util.Optional;

public class FordFactory extends CarFactory {
    
    private static FordFactory fordFactory;
    
    private FordFactory() {

    }
    
    public static FordFactory get() {
	return Optional.ofNullable(fordFactory)
		.orElseGet(() -> {
		    fordFactory = new FordFactory();
		    return fordFactory;
		});
    }

    @Override
    public AbstractCar createCar() {
	return new FordCar("Ford");
    }

    @Override
    public AbstractEngine createEngine() {
	return new FordEngine();
    }

}
