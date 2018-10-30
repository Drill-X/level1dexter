package level1;

import javax.swing.JOptionPane;

public class Wordarrow {
static String word;
 static int numTimesPrint;
	public Wordarrow() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	word = JOptionPane.showInputDialog("Please input a word");
	String s = JOptionPane.showInputDialog("Please input a number");
	numTimesPrint = Integer.parseInt(s);
	for (int i = 0; i < numTimesPrint / 2; i++) {
		for (int j = -1; j < i; j++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	for (int a = numTimesPrint / 2; a > -1; a--) {
		for (int b = -1; b < a; b++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
}
}
