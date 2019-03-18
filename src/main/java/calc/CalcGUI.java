package calc;

import javax.swing.JOptionPane;

public class CalcGUI {
	static Parser parser;
	
	public CalcGUI()
	{
		parser = new Parser();
	}
	
	public void Start()
	{
		// TODO Auto-generated method stub
		String input;
		int result = 0;
		while(true)
		{
			input = JOptionPane.showInputDialog(null, "Input:", "Calculator", JOptionPane.INFORMATION_MESSAGE);
			if(input == null)
			{
				break;
			}
			
			try {
				result = parser.ParseThis(input);
				JOptionPane.showMessageDialog(null, input + " = " + result);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
