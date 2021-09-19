package task9;

public class TaskStart {

    public static void main(String[] args) {
	Calculator calculator = new Calculator();

	double result = 0;
	result = calculator.add(5);
	System.out.println(result);
	result = calculator.multiply(4);
	System.out.println(result);
	result = calculator.subtract(2);
	System.out.println(result);
	result = calculator.redo();
	System.out.println(result);
	result = calculator.undo();
	System.out.println(result);
	result = calculator.divide(3);
	System.out.println(result);
	System.out.println("----UNDO 3----");
	result = calculator.undo(3);
	System.out.println(result);
	System.out.println("----REDO 3----");
	result = calculator.redo(3);
	System.out.println(result);
    }

}
