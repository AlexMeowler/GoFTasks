package task9;

public class Calculator {
    
    private ArithmeticUnit arithmeticUnit;
    private ControlUnit controlUnit;
    
    public Calculator() {
	arithmeticUnit = new ArithmeticUnit();
	controlUnit = new ControlUnit();
    }
    
    private double run(Command command) {
	controlUnit.storeCommand(command);
	controlUnit.executeCommand();
	return arithmeticUnit.getRegister();
    }
    
    public double add(double operand) {
	return run(new AddCommand(arithmeticUnit, operand));
    }
    
    public double subtract(double operand) {
	return run(new SubtractCommand(arithmeticUnit, operand));
    }
    
    public double multiply(double operand) {
	return run(new MultiplyCommand(arithmeticUnit, operand));
    }
    
    public double divide(double operand) {
	return run(new DivideCommand(arithmeticUnit, operand));
    }
    
    public double redo() {
	controlUnit.redo();
	return arithmeticUnit.getRegister();
    }
    
    public double undo() {
	controlUnit.undo();
	return arithmeticUnit.getRegister();
    }
    
    public double redo(int amount) {
	controlUnit.redo(amount);
	return arithmeticUnit.getRegister();
    }
    
    public double undo(int amount) {
	controlUnit.undo(amount);
	return arithmeticUnit.getRegister();
    }

}
