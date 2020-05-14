package data;

import java.util.List;

public class Equation {
	private List<Operation> operaitonList;
	private List<Character> operators;
	
	public Equation(List<Operation> operaitonList, List<Character> operators) {
		super();
		this.operaitonList = operaitonList;
		this.operators = operators;
	}

	public List<Operation> getOperaitonList() {
		return operaitonList;
	}

	public void setOperaitonList(List<Operation> operaitonList) {
		this.operaitonList = operaitonList;
	}

	public List<Character> getOperators() {
		return operators;
	}

	public void setOperators(List<Character> operators) {
		this.operators = operators;
	}
}
