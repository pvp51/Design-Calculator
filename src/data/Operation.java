package data;

public class Operation {
	int op1;
	char op;
	int op2;
	
	public Operation(int op1, char op, int op2) {
		super();
		this.op1 = op1;
		this.op = op;
		this.op2 = op2;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}
}
