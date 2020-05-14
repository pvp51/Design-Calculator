package manager;

import data.Equation;
import data.Operation;

public interface Calculator {
	
	public boolean calculate(Equation equation);
	
	public boolean calculate(Operation operation);
	
	public boolean calculate(boolean op1, char op, boolean op2);
}
