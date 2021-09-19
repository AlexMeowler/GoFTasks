package task3;

public class TaskStart {

    public static void main(String[] args) {
	TransportCompany taxiCompany = new TaxiTransportCompany("Служба такси");
	TransportCompany shippingCompany = new ShippingTansportCompany("Служба грузоперевозок");
	TransportCompany aiCompany = new AIDriverCompany("Такси с водителем-ИИ");
	
	TransportService taxiService = taxiCompany.create("Такси", 1);
	TransportService shippingService = shippingCompany.create("Грузоперевозки", 2);
	TransportService aiService = aiCompany.create("Водитель-ИИ", 3);
	
	printInfo(taxiService, 2.5);
	printInfo(shippingService, 3);
	printInfo(aiService, 11);
    }
    
    private static void printInfo(TransportService service, double dist) {
	System.out.printf("Компания %s, расстояние %.2f, стоимость %.2f\n", 
		service.getName(), dist, service.costTransportation(dist));
    }

}
