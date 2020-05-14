package manager;

import java.util.ArrayList;
import java.util.List;

import data.Equation;
import data.Operation;

public class ParsingImpl implements Parser {

	@Override
	public Equation parse(String str) {
		List<Operation> operationList = new ArrayList<>();
		List<Character> operators = new ArrayList<>();
		String splitStr[] = str.split("\\s");
		//(2<3) & (3<4)
		for(String split : splitStr) {
			System.out.println("Operation: "+split);
			if(split.length() == 1) {
				operators.add(split.charAt(0));
				continue;
			}
			split = split.substring(1, split.length()-1);
			operationList.add(new Operation(split.charAt(0), split.charAt(1), split.charAt(2)));
		}		
		return new Equation(operationList, operators);
	}
}
