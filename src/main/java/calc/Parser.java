package calc;

import org.apache.commons.lang3.*;
import org.apache.commons.lang3.math.NumberUtils;

public class Parser {
	CalculatorMain calc;
	
	public Parser() {
		calc = new CalculatorMain();
	}
	
	public int ParseThis(String hello) throws Exception
	{
		String[] split = hello.split("\\s+");
		if(!StringUtils.isNumeric(split[0]) || !StringUtils.isNumeric(split[2]))
			throw new Exception("Numbers not valid!");
		int a = NumberUtils.createInteger(split[0]);
		int b = NumberUtils.createInteger(split[2]);
		switch(split[1].charAt(0))
		{
		case '+':
			return calc.add(a, b);
		case '-':
			return calc.sub(a, b);
		default:
			throw new Exception("No valid operator!");
		}
	}
}
