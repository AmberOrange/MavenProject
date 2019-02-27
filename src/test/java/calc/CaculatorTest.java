package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testPow() {
		assertEquals(729, calc.pow(9,3));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	@Test
	public void testFac() {
		assertEquals(24, calc.fac(4));
	}
	@Test
	public void testMod() {
		assertEquals(3, calc.mod(8, 5));
	}
	@Test
	public void testPowAdd() {
		assertEquals(729, calc.pow(calc.add(calc.sub(9, 3), 3), calc.div(9, 3)));
	}
}
