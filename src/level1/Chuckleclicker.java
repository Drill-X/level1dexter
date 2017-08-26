package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckleclicker {
public static void main(String[] args) {
	makeButtons();
	
}
 static void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton("JOKE");
	JButton punchLine = new JButton("PUNCHLINE");
	frame .add(panel);
	panel.add(joke);
	panel.add(punchLine);
	joke.addActionListener(
			(e)->{
			JOptionPane.showMessageDialog(null, "why did the chiken cross the road");	
			
			
			});
	punchLine.addActionListener(
			(e)->{
			JOptionPane.showMessageDialog(null, "nobodey knows");	
			
			
			});
	
	
	
	frame.setVisible(true);
	frame.pack();
}
}
