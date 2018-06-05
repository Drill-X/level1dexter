package level1;

import javax.swing.JOptionPane;

public class spellBackwords {
public static void main(String[] args) {
	String wordT = JOptionPane.showInputDialog("put in a word");
	JOptionPane.showMessageDialog(null, flip(wordT));
}
static String flip(String s){
	int leng = s.length() - 1;
	String fliped = "";
	char flipedC;
	for (int i = leng; i >= 0; i--) {
		flipedC = s.charAt(i);
		fliped += flipedC;
	}
	return fliped;
}
}
