package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class candyman implements ActionListener {
	int timesPressed = 0;
public candyman() {
	this.timesPressed = timesPressed;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("CANDYYYYYYYYYYYYY");
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	frame.pack();
button.addActionListener(this);
}
public static void main(String[] args) {
candyman candyman = new candyman();	

			
}

			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(timesPressed >= 4) {
					System.out.println("button pressed 5 times");
					
				}else {
					timesPressed++;
					System.out.println(timesPressed);
				}
			}
			}

