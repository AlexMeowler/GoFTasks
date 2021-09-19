package task8;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handle(Receiver receiver) {
	if(receiver.isBankTransfer()) {
	    System.out.println("Выполняем банковский перевод");
	} else if (getSuccessor() != null) {
	    getSuccessor().handle(receiver);
	}
    }

}
