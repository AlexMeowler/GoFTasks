package task4;

public class TaskStart {

    public static void main(String[] args) {
	Client fordClient = new Client(FordFactory.get());
	Client toyotaClient = new Client(ToyotaFactory.get());
	System.out.println(fordClient.toString());
	System.out.println(toyotaClient.toString());
	
	System.out.println("-----");
	System.out.println(FordFactory.get());
	System.out.println(FordFactory.get());
	System.out.println("-----");
	System.out.println(ToyotaFactory.get());
	System.out.println(ToyotaFactory.get());
    }

}
