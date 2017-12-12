package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//7: hovor red underline, choose "add unimplemented methods"
public class SwingListnerExample implements ActionListener {
	 //2: make GUI components
	JFrame frame = new JFrame("SwingListnerExample");
	JPanel panel = new JPanel();
	JButton B1 = new JButton("Button 1");
	JButton B2 = new JButton("Button 2");
	//1: make run methad, this will run the code for the GUI
 public void run() {
	//4: add GUI components, setVisible, and pack
	frame.add(panel);
	panel.add(B1);
	panel.add(B2);
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//5: add action listners
	B1.addActionListener(this); //6: Hovor red underline, choose implement option
	B2.addActionListener(this);
}

public static void main(String[] args) {
	//2: transfer control to run() through main
SwingListnerExample swliex = new SwingListnerExample();
swliex.run();
}

@Override
//this method runs whenever an event is detected
public void actionPerformed(ActionEvent e) {
	//8: figure out which component triggered event
	JButton BP = (JButton)e.getSource();
	if(BP == B1){
		System.out.println("Button 1 Pressed");
	}else if(BP == B2){
		System.out.println("Button 2 Pressed");
	}else {
		System.out.println("This Should Never Be Printed: 123465789");
	}
	
}


}
