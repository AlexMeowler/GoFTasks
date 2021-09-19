package task2;

public class TaskStart {

    public static void main(String[] args) {
	Client fordClient = new Client(new FordFactory());
	Client toyotaClient = new Client(new ToyotaFactory());
	System.out.println(fordClient.toString());
	System.out.println(toyotaClient.toString());
    }

}
