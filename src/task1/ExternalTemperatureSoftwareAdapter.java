package task1;

public class ExternalTemperatureSoftwareAdapter implements Temperature {

    private ExternalTemperatureSoftware software;

    public ExternalTemperatureSoftwareAdapter(ExternalTemperatureSoftware software) {
	this.software = software;
    }

    @Override
    public double measureTemperature() {
	return (software.getTemperature() - 32) / 1.8;
    }
}
