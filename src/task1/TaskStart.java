package task1;

public class TaskStart {

    public static void main(String[] args) {
	ExternalTemperatureSoftware ext = new ExternalTemperatureSoftware();
	Temperature adapter = new ExternalTemperatureSoftwareAdapter(ext);

	System.out.printf("Температура окружающей среды равна %.2f F\n", ext.getTemperature());

	System.out.printf("Температура окружающей среды равна %.2f C", adapter.measureTemperature());
    }

}
