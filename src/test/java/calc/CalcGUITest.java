package calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.awt.image.BufferedImage;

import org.junit.BeforeClass;
import org.junit.Test;

import eye.Eye;
import eye.Match;

public class CalcGUITest {

	static Eye eye;
	static CalcGUI gui;
	
	@BeforeClass
	public static void setup(){
		eye = new Eye();
		gui = new CalcGUI();
		
		eye.setTimeout(3);
	}
	
//	@Test
//	public void testGUI()
//	{
//		BufferedImage image = eye.loadImage("src/test/resources/ok.png");
//		if(image == null)
//			fail("Image \"ok.png\" could not be found");
//		
//		Match match = eye.findImage(image);
//		//fail(match.getCenterLocation().toString());
//		if(match == null)
//			fail("Could not find ok button");
//		eye.click(match.getCenterLocation());
//		
//		match = eye.findImage(image);
//		
////		image = eye.loadImage("src/test/resources/notvalid.png");
////		if(image == null)
////			fail("Image \"notvalid\" could not be found");
////		
////		match = eye.findImage(image);
//		assertNotEquals(null, match);
//	}
}
