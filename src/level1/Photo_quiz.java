package level1;

// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Photo_quiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String potatoe = "http://i1.mirror.co.uk/news/world-news/article5029020.ece/ALTERNATES/s615/this_is_a_potato.jpg";
String carrot = "http://www.carrot-thailand.com/images/carrot-logo-m.png";
int score = 0;
		// 2. create a variable of type "Component" that will hold your image
 Component c;
 Component f;
		// 3. use the "createImage()" method below to initialize your Component
 c = createImage(potatoe);
 f = createImage(carrot);
		// 4. add the image to the quiz window
quizWindow.add(c);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String b = JOptionPane.showInputDialog("what is this a picture of (all caps)");
		// 7. print "CORRECT" if the user gave the right answer
if(b.equals("POTATO")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
	
}else{
	JOptionPane.showMessageDialog(null, "INCORRECT");
	score--;
}
if(score <= -1){score = 0;}JOptionPane.showMessageDialog(null, "youre score is "+score);
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
quizWindow.add(f);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String m = JOptionPane.showInputDialog("what is this a picture of (all caps)");
		// 14+ check answer, say if correct or incorrect, etc.
if(m.equals("CARROT")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
	
}else{
	JOptionPane.showMessageDialog(null, "INCORRECT");
	score--;
}if(score <= -1){score = 0;}JOptionPane.showMessageDialog(null, "youre score is "+score);


String v = JOptionPane.showInputDialog("what color is this carrot (all caps)");
if(v.equals("ORANGE")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	score++;
	
}else{
	JOptionPane.showMessageDialog(null, "INCORRECT");
	score--;
}if(score <= -1){score = 0;}JOptionPane.showMessageDialog(null, "youre score is "+score);
if(score == 3){
	JOptionPane.showMessageDialog(null, "YOU WIN");
	
}else{
	JOptionPane.showMessageDialog(null, "YOU LOSE");
	
}





	}
	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





