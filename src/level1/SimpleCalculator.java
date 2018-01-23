package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField num1 = new JTextField(20);
	JTextField num2 = new JTextField(20);
	JLabel ans = new JLabel("ANSWER");
	JButton Bdiv = new JButton("÷");
	JButton Badd = new JButton("+");
	JButton Bsub = new JButton("-");
	JButton Bmul = new JButton("x");
	double eNum1;
	double eNum2;
	double ansNum;
	
	void run() {
		addComp();
		addListner();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	
public static void main(String[] args) {
SimpleCalculator calc = new SimpleCalculator();
	calc.run();
}

void addComp() {
	frame.add(panel);
	panel.add(num1);
	panel.add(num2);
	panel.add(ans);
	panel.add(Bdiv);
	panel.add(Bmul);
	panel.add(Badd);
	panel.add(Bsub);
}
void addListner() {
	Bdiv.addActionListener(this);
	Bmul.addActionListener(this);
	Badd.addActionListener(this);
	Bsub.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("ButtonPressed");
	String In1S= num1.getText();
	String In2S = num2.getText();
	double In1 = Integer.parseInt(In1S);
	double In2 = Integer.parseInt(In2S);
	JButton BP = (JButton)e.getSource();
	if(BP == Badd){
		ansNum = add(In1,In2);
		System.out.println("add");
	}else if(BP == Bsub){
		ansNum = sub(In1,In2);
		System.out.println("sub");
	}else if(BP == Bmul){
		ansNum = mul(In1,In2);
		System.out.println("mul");
	}else if(BP == Bdiv){
		ansNum = div(In1,In2);
		System.out.println("div");
	}
	String labelText = Double.toString(ansNum);
	ans.setText(labelText);
	frame.pack();
}
double add(double in1,double in2){
	double c;
	c = in1+in2;
	return(c);
}
double sub(double in1,double in2){
	double c;
	c = in1-in2;
	return(c);
}
double mul(double in1,double in2){
	double c;
	c = in1*in2;
	return(c);
}
double div(double in1,double in2){
	double c;
	c = in1/in2;
	return(c);
}
}
 
