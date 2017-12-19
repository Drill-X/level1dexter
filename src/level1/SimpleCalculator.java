package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleCalculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton B1 = new JButton("1");
	JButton B2 = new JButton("2");
	JButton B3 = new JButton("3");
	JButton B4 = new JButton("4");
	JButton B5 = new JButton("5");
	JButton B6 = new JButton("6");
	JButton B7 = new JButton("7");
	JButton B8 = new JButton("8");
	JButton B9 = new JButton("9");
	JButton Bdiv = new JButton("÷");
	JButton Badd = new JButton("+");
	JButton Bsub = new JButton("-");
	JButton Bmul = new JButton("X");
	double eNum1;
	double eNum2;
	double finNum;
	boolean secNum = false;
	
	void run() {
		addComp();
		
		frame.setVisible(true);
		frame.pack();
	}
	
public static void main(String[] args) {
SimpleCalculator calc = new SimpleCalculator();
	calc.run();
}

void addComp() {
	frame.add(panel);
	panel.add(B1);
	panel.add(B2);
	panel.add(B3);
	panel.add(B4);
	panel.add(B5);
	panel.add(B6);
	panel.add(B7);
	panel.add(B8);
	panel.add(B9);
	panel.add(Bdiv);
	panel.add(Bmul);
	panel.add(Badd);
	panel.add(Bsub);
}
void addListner() {
	B1.addActionListener(this);
	B2.addActionListener(this);
	B3.addActionListener(this);
	B4.addActionListener(this);
	B5.addActionListener(this);
	B6.addActionListener(this);
	B7.addActionListener(this);
	B8.addActionListener(this);
	B9.addActionListener(this);
	Bdiv.addActionListener(this);
	Bmul.addActionListener(this);
	Badd.addActionListener(this);
	Bsub.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton BP = (JButton)e.getSource();
	if(BP == B1 && secNum == false) {
		eNum1 += 1;
	}else if(BP == B2 && secNum == false) {
		eNum1 += 2;
	}else if(BP == B3 && secNum == false) {
		eNum1 += 3;
	}else if(BP == B4 && secNum == false) {
		eNum1 += 4;
	}else if(BP == B5 && secNum == false) {
		eNum1 += 5;
	}else if(BP == B6 && secNum == false) {
		eNum1 += 6;
	}else if(BP == B7 && secNum == false) {
		eNum1 += 7;
	}else if(BP == B8 && secNum == false) {
		eNum1 += 8;
	}else if(BP == B9 && secNum == false) {
		eNum1 += 9;
	}else if(BP == B1 && secNum == true) {
		eNum2 += 1;
	}else if(BP == B2 && secNum == true) {
		eNum2 += 2;
	}else if(BP == B3 && secNum == true) {
		eNum2 += 3;
	}else if(BP == B4 && secNum == true) {
		eNum2 += 4;
	}else if(BP == B5 && secNum == true) {
		eNum2 += 5;
	}else if(BP == B6 && secNum == true) {
		eNum2 += 6;
	}else if(BP == B7 && secNum == true) {
		eNum2 += 7;
	}else if(BP == B8 && secNum == true) {
		eNum2 += 8;
	}else if(BP == B9 && secNum == true) {
		eNum2 += 9;
	}
	}
void updateEquasion() {
	
	
}
}
 
