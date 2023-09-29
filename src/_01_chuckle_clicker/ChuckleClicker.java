package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}
	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button2.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Why couldn't the sunflower ride its bike?");
		}
		else {
			JOptionPane.showMessageDialog(null, "It lost its petals.");
		}
	}
}
