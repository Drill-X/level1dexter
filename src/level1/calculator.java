package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField num1 = new JTextField(20);
	JTextField num2 = new JTextField(20);
	JLabel ans = new JLabel("ANSWER");
	JButton Badd = new JButton("+");
	JButton Bmul = new JButton("x");
	JButton Bsqt = new JButton("√");
	JButton Bexp = new JButton("^");
	double eNum1;
	double eNum2;
	double ansNum;
void run() {
	addJstuff();
	addListner();
	
	frame.pack();
	frame.setVisible(true);
}
public static void main(String[] args) {
	calculator calc = new calculator();
	calc.run();
}
void addJstuff(){
	frame.add(panel);
	panel.add(num1);
	panel.add(num2);
	panel.add(ans);
	panel.add(Badd);
	panel.add(Bmul);
	panel.add(Bsqt);
	panel.add(Bexp);
	frame.pack();
}
void addListner() {
	Badd.addActionListener(this);
	Bmul.addActionListener(this);
	Bsqt.addActionListener(this);
	Bexp.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String In1S= num1.getText();
	String In2S = num2.getText();
	double In1 = Integer.parseInt(In1S);
	double In2 = Integer.parseInt(In2S);
	JButton BP = (JButton)e.getSource();
	if(BP == Badd){
		ansNum = 	add(In1,In2);
	}else if(BP == Bmul){
		ansNum = mul(In1,In2);
	}else if(BP == Bsqt) {
		//ansNum=
	}else if(BP == Bexp){
		ansNum = exp(In1,In2);
	}
	String labelText = Double.toString(ansNum);
	ans.setText(labelText);
	frame.pack();
}
double add(double num1, double num2) {
	double ans = num1 + num2;
	return(ans);
}

double mul(double num1, double num2) {
	double ans = num1*num2;
	return(ans);
}

//double sqt (double num1, double num2) {
//	double ans = 
//	return(ans);
//}
double exp (double num1, double num2) {
	double ans = 0;
	for (int i = 0; i < num2; i++) {
	ans +=	num1*num1;
	System.out.println(ans);
	}
		return(ans);	
}
}
