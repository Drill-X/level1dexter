package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class myGUI {

	JButton button;
	JButton button2;
	JFrame frame;
	JPanel panel;
	void setup(){
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
	button = new JButton("I am a button");
	button2 = new JButton("Click me");
	panel.add(button);
	button2 = new JButton("Click me");
	button.addActionListener(
			(e)->{
				panel.add(button2);
				panel.repaint();
				JOptionPane.showMessageDialog(null, "hi");
				frame.setSize(500, 500);
			}
			
			
			
			);
	
	frame.setSize(500, 500);
	
	
}
}
