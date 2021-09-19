package task4;

public class FordCar extends AbstractCar {

    public FordCar(String name) {
	setName(name);
    }

    @Override
    public int maxSpeed(AbstractEngine engine) {
	return engine.getMaxSpeed();
    }

}
