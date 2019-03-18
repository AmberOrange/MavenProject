package calc;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class ParserTest {

private static Parser parser;
	
	@BeforeClass
	public static void setup(){
		parser = new Parser();
	}
	
	@Test
	public void testParserAdd() throws Exception
	{
		assertEquals(10, parser.ParseThis("6 + 4"));
	}
	
	@Test
	public void testParserSub() throws Exception
	{
		assertEquals(2, parser.ParseThis("6 - 4"));
	}
	
	@Test(expected = Exception.class)
	public void testParserThrows() throws Exception
	{
		parser.ParseThis("6+4");
	}
}
