package level1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyButton {

	/*
	 * Use the methods below to make an easy button show on the screen. When
	 * clicked, it says some very annoying words.
	 */
	void run() {
		showEasyButton();
	}

	public static void main(String[] args) {
		EasyButton eas = new EasyButton();
		eas.run();
	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		JButton but = new JButton();
		JFrame frame = new JFrame();
		quizWindow.add(but);
		but.addActionListener((e) -> {
			speak("BUTOON");
		});
		quizWindow.setVisible(true);
		URL imageURL = null;
		try {
			imageURL = new File("/Users/league/Google Drive/league-images/easy_button.jpg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}
		Icon icon = new ImageIcon(imageURL);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
