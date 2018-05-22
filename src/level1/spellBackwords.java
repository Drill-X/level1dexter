package level1;

import javax.swing.JOptionPane;

public class spellBackwords {
public static void main(String[] args) {
	String wordT = JOptionPane.showInputDialog("put in a word");
	System.out.println(flip(wordT));
}
static String flip(String s){
	int leng = s.length() - 1;
	String fliped = "";
	char flipedC;
	System.out.println("test pased");
	for (int i = leng; i < 0; i--) {
		flipedC = s.charAt(i);
		fliped = fliped + Character.toString(flipedC);
	}
	return fliped;
}
}
