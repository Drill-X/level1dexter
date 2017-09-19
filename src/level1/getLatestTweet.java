package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class getLatestTweet {
public static void main(String[] args) {
	getLatestTweet getLatestTweet = new getLatestTweet();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(140);
	JButton button = new JButton("CHECK TWITTER");
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	frame.pack();
	frame.setVisible(true);
	button.addActionListener(
			(e)->{
				String check = 	getLatestTweet.getLatestTweet(text.getText());
		 text.setText(check);
		 JOptionPane.showMessageDialog(null, check);
			});
	
}
private  String getLatestTweet(String searchingFor) {

	Twitter twitter = new TwitterFactory().getInstance();
	AccessToken accessToken = new AccessToken(
			"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
			"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
			"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	try {
		QueryResult result = twitter.search(query);
		return result.getTweets().get(0).getText();
	} catch (Exception e) {
		System.err.print(e.getMessage());
		return "ERROR";
	}
}



}


