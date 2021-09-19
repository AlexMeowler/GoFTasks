package task2;

public class Client {

    private AbstractCar abstractCar;
    private AbstractEngine abstractEngine;

    public Client(CarFactory carFactory) {
	abstractCar = carFactory.createCar();
	abstractEngine = carFactory.createEngine();
    }

    @Override
    public String toString() {
	return String.format("Максимальная скорость %s составляет %d км/ч", abstractCar.getName(),
		abstractCar.maxSpeed(abstractEngine));
    }
}
