package task8;


public class PayPalHandler extends PaymentHandler {
    
    @Override
    public void handle(Receiver receiver) {
	if(receiver.isPayPalTransfer()) {
	    System.out.println("Выполняем перевод через PayPal");
	} else if (getSuccessor() != null) {
	    getSuccessor().handle(receiver);
	}
    }

}
