package task8;

public class TaskStart {

    public static void main(String[] args) {
	Receiver receiver = new Receiver(true, true, true);
	
	PaymentHandler bankPaymentHandler = new BankPaymentHandler();
	PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
	PaymentHandler payPalPaymentHandler = new PayPalHandler();
	
	bankPaymentHandler.setSuccessor(payPalPaymentHandler);
	payPalPaymentHandler.setSuccessor(moneyPaymentHandler);
	
	bankPaymentHandler.handle(receiver);
    }

}
