package level1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String letter;
	void run() {
		currentLetter = generateRandomLetter();
		letter = Character.toString(currentLetter);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		label.setText(letter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);

		frame.setSize(500, 500);
	}

	public static void main(String[] args) {
		typingTutor tut = new typingTutor();
		tut.run();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char let = e.getKeyChar();
		String let2 = Character.toString(let);
		System.out.println(let2);
		if(letter.equals(let2)){
			panel.setBackground(Color.green);
		}else {
			panel.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
letter = Character.toString(currentLetter);
		label.setText(letter);
	}

}
