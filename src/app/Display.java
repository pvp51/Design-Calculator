package app;

import data.Equation;
import manager.Calculator;
import manager.CalculatorImpl;
import manager.Parser;
import manager.ParsingImpl;

public class Display {

	public static void main(String[] args) {
		// FOr eg: (1+2) , (2 == 3) || (3 <= 3) ...??
		String[] arr = { "(2<3) & (3<4)", "(2>3) & (3<4)", "(3<4)", "(3<2)" };
		Parser parse = new ParsingImpl();
		Calculator calc = new CalculatorImpl();
		
		for(String str : arr) {
			Equation equation = parse.parse(str);
			System.out.println(str + " : " + calc.calculate(equation));
		}
	}
}
