package task8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PaymentHandler {
    
    private PaymentHandler successor;
    
    public abstract void handle(Receiver receiver);
}
