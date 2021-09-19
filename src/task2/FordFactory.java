package task2;

public class FordFactory extends CarFactory {

    @Override
    public AbstractCar createCar() {
	return new FordCar("Ford");
    }

    @Override
    public AbstractEngine createEngine() {
	return new FordEngine();
    }

}
