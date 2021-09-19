package task8;

public class MoneyPaymentHandler extends PaymentHandler {
    
    @Override
    public void handle(Receiver receiver) {
	if(receiver.isMoneyTransfer()) {
	    System.out.println("Выполняем перевод через системы денежных переводов");
	} else if (getSuccessor() != null) {
	    getSuccessor().handle(receiver);
	}
    }

}
