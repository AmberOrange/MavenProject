package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int div(int a, int b) {
		if (b == 0)
			return 0;
		
		return a/b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int mod(int a, int b) {
		if (b == 0)
			return 0;
		return a % b;
	}
	public int pow(int a, int b) {
		return (int) java.lang.Math.pow(a, b);
	}
	public int fac(int a) {
		if (a < 2)
			return 1;
		
		return fac(a-1) * a;
	}
}
