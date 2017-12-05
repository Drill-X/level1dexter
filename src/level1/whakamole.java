package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whakamole implements ActionListener {
	Date timeAtStart = new Date();
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
		addButtonActionListiner();
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
		JButton BP = (JButton)e.getSource();
		if(BP == B1 && mole == 1){
			molGood ++;
		}else if(BP == B2 && mole == 2) {
			molGood ++;	
		}else if(BP == B3 && mole == 3) {
			molGood ++;	
		}else if(BP == B4 && mole == 4) {
			molGood ++;	
		}else if(BP == B5 && mole == 5) {
			molGood ++;	
		}else if(BP == B6 && mole == 6) {
			molGood ++;	
		}else if(BP == B7 && mole == 7) {
			molGood ++;	
		}else if(BP == B8 && mole == 8) {
			molGood ++;	
		}else if(BP == B9 && mole == 9) {
			molGood ++;	
		}else {
			molBad ++;
			if(molBad == 1) {
				System.out.println("bad1");
			}else if(molBad == 2) {
				System.out.println("bad2");
			}else if(molBad == 3) {
				System.out.println("bad3");
			}else if(molBad >= 4) {
				System.out.println("bad4");
				endGame(timeAtStart , molGood);
			}
		} 
		setMole();
		frame.setTitle("SCORE: " +molGood);
	}
		
		private void endGame(Date timeAtStart, int molesWhacked)
		{
			Date timeAtEnd = new Date();
			JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

		
		
		
	}

