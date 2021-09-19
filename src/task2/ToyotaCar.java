package task2;

public class ToyotaCar extends AbstractCar {

    public ToyotaCar(String name) {
	setName(name);
    }

    @Override
    public int maxSpeed(AbstractEngine engine) {
	return engine.getMaxSpeed();
    }

}
