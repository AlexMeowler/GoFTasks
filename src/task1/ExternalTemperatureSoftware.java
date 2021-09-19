package task1;

public class ExternalTemperatureSoftware {

    private double temp;

    public ExternalTemperatureSoftware() {
	temp = Math.random() * 150;
    }

    public double getTemperature() {
	return temp;
    }

}
