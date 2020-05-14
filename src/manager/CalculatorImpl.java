package manager;

import java.util.List;

import data.Equation;
import data.Operation;

public class CalculatorImpl implements Calculator {

	@Override
	public boolean calculate(Equation equation) {
		List<Operation> operationList = equation.getOperaitonList();
		List<Character> operators = equation.getOperators();
		if(operationList.size() == 1) {
			return calculate(operationList.get(0));
		}
		boolean answer = false;
		for(int i=0; i<operationList.size()-1; i++) {
			boolean op1 = calculate(operationList.get(i));
			char op = operators.get(i);
			boolean op2 = calculate(operationList.get(i+1));
			answer = calculate(op1, op, op2);	
		}
		return answer;
	}

	@Override
	public boolean calculate(Operation operation) {
		char op = operation.getOp();
		int op1 = operation.getOp1();
		int op2 = operation.getOp2();
		boolean answer = false;
		switch(op) {
        case '>' :
        	answer = op1 > op2; 
        	break;
        case '<' :
        	answer = op1 < op2;
        	break;
        default :
           System.out.println("Invalid operation");
		}
		return answer;
	}

	@Override
	public boolean calculate(boolean op1, char op, boolean op2) {
		boolean answer = false;
		switch(op) {
        case '&' :
        	answer = op1 & op2; 
        	break;
        case '|' :
        	answer = op1 | op2;
        	break;
        case '!' :
        	answer = ! op1;
        	break;
        default :
           System.out.println("Invalid operation");
		}
		return answer;
	}
}
