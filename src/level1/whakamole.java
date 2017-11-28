package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whakamole implements ActionListener {
	int mole;
	int molBad;
	int molGood;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JButton B5 = new JButton();
	JButton B6 = new JButton();
	JButton B7 = new JButton();
	JButton B8 = new JButton();
	JButton B9 = new JButton();

	void run() {
		frame.add(panel);
		addButtons();
		setMole();

		frame.setSize(250, 150);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		whakamole mole = new whakamole();
		mole.run();
	}

	void addButtons() {
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(B4);
		panel.add(B5);
		panel.add(B6);
		panel.add(B7);
		panel.add(B8);
		panel.add(B9);

	}

	void setMole() {
		mole = new Random().nextInt(9) + 1;
		System.out.println(mole);
		if (mole == 1) {
			B1.setText("MOLE");
		} else if (mole == 2) {
			B2.setText("MOLE");
		} else if (mole == 3) {
			B3.setText("MOLE");
		} else if (mole == 4) {
			B4.setText("MOLE");
		} else if (mole == 5) {
			B5.setText("MOLE");
		} else if (mole == 6) {
			B6.setText("MOLE");
		} else if (mole == 7) {
			B7.setText("MOLE");
		} else if (mole == 8) {
			B8.setText("MOLE");
		} else if (mole == 9) {
			B9.setText("MOLE");
		}

	}

	void addButtonActionListiner() {
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(mole);
	}
}
