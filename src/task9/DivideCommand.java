package task9;

public class DivideCommand extends Command {

    public DivideCommand(ArithmeticUnit unit, double operand) {
	super(unit, operand);
    }

    @Override
    public void execute() {
	unit.run('/', operand);

    }

    @Override
    public void unExecute() {
	unit.run('*', operand);
    }

}
