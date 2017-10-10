package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class candyman implements ActionListener {
	int timesPressed = 0;

	public candyman() {
		this.timesPressed = timesPressed;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("CANDYYYYYYYYYYYYY");
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	}

	public static void main(String[] args) {
		candyman candyman = new candyman();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (timesPressed >= 4) {
			System.out.println("button pressed 5 times");
			playSound(CREEPY);
			showPictureFromTheInternet(
					"https://images.moviecutouts.com/image/cache/data/incoming/pics/candycanedancinglarge-500x500.jpg");
		} else {
			timesPressed++;
			System.out.println(timesPressed);
			playSound(CREEPY);
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/league/Desktop/level1/candy 1.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/league/Desktop/level1/gimmmecandy.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
