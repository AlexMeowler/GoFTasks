package task9;

import lombok.Getter;

@Getter
public class ArithmeticUnit {
    
    private double register;
    
    public void run(char operation, double operand) {
	switch (operation) {
	case '+':
	    register += operand;
	    break;
	case '-':
	    register -= operand;
	    break;
	case '*':
	    register *= operand;
	    break;
	case '/':
	    register /= operand;
	    break;
	default:
	    throw new ArithmeticException("Операция не поддерживается");
	}
    }

}
