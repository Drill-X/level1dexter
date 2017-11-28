package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	int moneySpent = 0;
	int moneyEarned = 0;
	int moneyLost = moneySpent - moneyEarned;
	int one = new Random().nextInt(3) + 1;
	int two = new Random().nextInt(3) + 1;
	int three = new Random().nextInt(3) + 1;
	String oneS = Integer.toString(one);
	String twoS = Integer.toString(two);
	String threeS = Integer.toString(three);
	String monSpent = Integer.toString(moneySpent);
	String monErnd = Integer.toString(moneyEarned);
	String monLost = Integer.toString(moneyLost);
	JFrame frame = new JFrame("Spent: $" + monSpent + ".00 Earned: $" + monErnd + ".00 Lost: $" + monLost + ".00");
	JPanel panel = new JPanel();
	JButton spin = new JButton("spin");
	JLabel slot1 = new JLabel("_");
	JLabel slot2 = new JLabel("_");
	JLabel slot3 = new JLabel("_");
	JLabel win = new JLabel("_");

	void run() {
		frame.add(panel);
		panel.add(spin);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		panel.add(win);
		spin.addActionListener(this);

		frame.setVisible(true);
		frame.setSize(400, 75);
	}

	public static void main(String[] args) {
		slotmachine slot = new slotmachine();
		slot.run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		moneySpent += 1;
		slot1.setText(oneS);
		slot2.setText(twoS);
		slot3.setText(threeS);
		if (one == two && two == three) {
			win.setText("YOU WIN!!!");
			moneyEarned += 3;
		} else {
			win.setText("try again");
		}
		moneyLost = moneySpent - moneyEarned;
		one = new Random().nextInt(3) + 1;
		two = new Random().nextInt(3) + 1;
		three = new Random().nextInt(3) + 1;
		oneS = Integer.toString(one);
		twoS = Integer.toString(two);
		threeS = Integer.toString(three);
		monSpent = Integer.toString(moneySpent);
		monErnd = Integer.toString(moneyEarned);
		monLost = Integer.toString(moneyLost);
		frame.setTitle("Spent: $" + monSpent + ".00 Earned: $" + monErnd + ".00 Lost: $" + monLost + ".00");
	}
}
