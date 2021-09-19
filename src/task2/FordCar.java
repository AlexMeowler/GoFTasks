package task2;

public class FordCar extends AbstractCar {

    public FordCar(String name) {
	setName(name);
    }

    @Override
    public int maxSpeed(AbstractEngine engine) {
	return engine.getMaxSpeed();
    }

}
