package level1;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton B1 = new JButton("B1");
	JButton B2 = new JButton("B2");
	JButton B3 = new JButton("B3");
void run() {
	addComp();
	addListner();
	
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	TootMachine toot = new TootMachine();
	toot.run();
}
void addComp() {
	frame.add(panel);
	panel.add(B1);
	panel.add(B2);
	panel.add(B3);
}
void addListner() {
	B1.addActionListener(this);
	B1.addActionListener(this);
	B1.addActionListener(this);
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton BP = (JButton)e.getSource();
	if(BP == B1){
		System.out.println("B1");
	}else if(BP == B2) {
		System.out.println("B2");
	}else if(BP == B3) {
		System.out.println("B3");
	}
}

}
