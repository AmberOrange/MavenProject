package calc;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.math.NumberUtils;

public class Parser {
	CalculatorMain calc;
	
	public Parser() {
		
	}
	
	public int ParseThis(String hello) throws Exception
	{
		String[] split = hello.split("\\s+");
		if(!StringUtils.isNumeric(split[0]) || !StringUtils.isNumeric(split[2]))
			throw new NumberFormatException();
		int[] numbers = {0,0};
		numbers[0] = NumberUtils.createInteger(split[0]);
		numbers[1] = NumberUtils.createInteger(split[2]);
		switch(split[1].charAt(0))
		{
		case '+':
			return calc.add(numbers[0], numbers[1]);
		case '-':
			return calc.sub(numbers[0], numbers[1]);
		default:
			throw new Exception("No valid operator!");
		}
	}
}
