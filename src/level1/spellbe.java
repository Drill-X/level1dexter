package level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class spellbe {
	int lines;
	ArrayList<String> words = new ArrayList<>();

	/*
	 * Get a random word using the randomWord() method and ask the user how to
	 * spell it using the speak() method. If the user spells it right move on to
	 * a new word, but if they do not spell it right ask again. The only place
	 * that you need to write code in is the stuffForYouToDo() Method
	 */
	
	public void stuffForYouToDo() {
		//You write code in here
		String wurd;
		String wurdTry;
		boolean didgetright = false;
		wurd = randomWord();
		Speak(wurd);
		System.out.println(wurd);
		wurdTry = JOptionPane.showInputDialog("How is it spelled?");
		while(didgetright == false) {
		if(wurdTry.equals(wurd)){
	didgetright = true;
		}else{
			Speak(wurd);
			wurdTry = JOptionPane.showInputDialog("How is it spelled?");
		}
		if(didgetright == true){
			wurd = randomWord();
			Speak(wurd);
			System.out.println(wurd);
			wurdTry = JOptionPane.showInputDialog("How is it spelled?");
			didgetright = false;
		}
	}}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public spellbe() {
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			//speakNoWait(lines + " words loaded");
			System.out.println("Number of words: " + lines);
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new spellbe();
	}

	public void Speak(String text) {
		try {
			Runtime.getRuntime().exec("say " + text).waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


