package task2;

public class ToyotaFactory extends CarFactory {
    @Override
    public AbstractCar createCar() {
	return new ToyotaCar("Toyota");
    }

    @Override
    public AbstractEngine createEngine() {
	return new ToyotaEngine();
    }
}
