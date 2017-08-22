package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_Converter {
public static void main(String[] args) {
	
	JTextField textin = new JTextField("INSERT BINARY HERE");
	JTextField textout = new JTextField("OUTPUT COMES HERE");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton("CONVERT");
	frame.add(panel);
	panel.add(convert);
	frame.pack();
	frame.setVisible(true);
	panel.add(textin);
	panel.add(textout);

	
	convert.addActionListener(
	(e)->{
		String binary = "0";
		binary = textin.getText();

		String end = convert(binary);
		textout.setText(end);	
	});

	frame.pack();
	
}

	 static String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	
	
}

