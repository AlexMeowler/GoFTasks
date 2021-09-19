package task9;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Command {
    
    protected ArithmeticUnit unit;
    protected double operand;
    
    public abstract void execute();
    public abstract void unExecute();

}
