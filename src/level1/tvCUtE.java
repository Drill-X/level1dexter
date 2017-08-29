package level1;

import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class tvCUtE {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
	frame.setVisible(true);
	frame.pack();
	
	button1.addActionListener(
			(e)->{
			showv1();
			
			});
	button2.addActionListener(
			(e)->{
			showv2();
			
			});
	button3.addActionListener(
			(e)->{
			showv3();
			
			});
}
static void showv1() {
	playVideo("OEwqg2WCWII");
}

static void showv2() {
	playVideo("fqek4lSw5vw");
}

static void showv3() {
	playVideo("yCAUoMlXwzk");
}

static void playVideo(String videoID) {
	try {
URI uri = new URI( "https://www.youtube.com/watch?v=" + videoID );
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
