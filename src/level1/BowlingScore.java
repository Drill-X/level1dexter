package level1;

import javax.swing.JOptionPane;

public class BowlingScore {
public static void main(String[] args) {
	String B = JOptionPane.showInputDialog("What's your best bowling score");
	int y =Integer.parseInt(B);
	if(y >= 0 && y <= 99 ){
		JOptionPane.showMessageDialog(null, "practice more");
		
	}else if(y >= 100 && y <= 199){
		JOptionPane.showMessageDialog(null, "you're good");
		
		
	}else if(y >= 200 && y <= 300){
		JOptionPane.showMessageDialog(null, "go pro");
		
		
	}else{
		JOptionPane.showMessageDialog(null, "impossible");
		
		
	}
	
	
}
}
