package level1;

import javax.swing.JOptionPane;

public class Pot {
	String poT;
public Pot(String pOt){
	poT = pOt;
	
}
	void stew(){
		if(poT.equals ("Stew")){
			String stewf = JOptionPane.showInputDialog("What stew would you like(With Stew at the end)");
			JOptionPane.showMessageDialog(null, "Your "+stewf + " is ready");
		}else{
			JOptionPane.showMessageDialog(null, "Your pot is not of the stew-making type");
			
		}
		
		
	}
	
	
	
}
