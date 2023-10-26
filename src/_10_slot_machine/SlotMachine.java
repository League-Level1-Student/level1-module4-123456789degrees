package _10_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JLabel first;
	JLabel second;
	JLabel third;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	public void run() throws MalformedURLException {
		JButton button = new JButton();
		button.setText("SPIN");
		frame.setVisible(true);
		frame.setSize(400, 400);
		button.addActionListener(this);
		first = createLabelImage("apple.png");
		second = createLabelImage("banana.jpeg");
		third = createLabelImage("cherry.jpeg");
		first.setPreferredSize(new Dimension(100, 100));
		second.setPreferredSize(new Dimension(100, 100));
		third.setPreferredSize(new Dimension(100, 100));
		panel.add(first);
		panel.add(second);
		panel.add(third);
		panel.add(button);
		frame.add(panel);
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.remove(first);
		panel.remove(second);
		panel.remove(third);
		Random randt = new Random();
		int rand = randt.nextInt(3);
		Random randt2 = new Random();
		int rand2 = randt2.nextInt(3);
		Random randt3 = new Random();
		int rand3 = randt3.nextInt(3);
		if (rand == 0) {
			try {
				first = createLabelImage("apple.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (rand == 1) {
			try {
				first = createLabelImage("banana.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			try {
				first = createLabelImage("cherry.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (rand2 == 0) {
			try {
				second = createLabelImage("apple.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (rand2 == 1) {
			try {
				second = createLabelImage("banana.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			try {
				second = createLabelImage("cherry.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (rand3 == 0) {
			try {
				third = createLabelImage("apple.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if (rand3 == 1) {
			try {
				third = createLabelImage("banana.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			try {
				third = createLabelImage("cherry.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		first.setPreferredSize(new Dimension(100, 100));
		second.setPreferredSize(new Dimension(100, 100));
		third.setPreferredSize(new Dimension(100, 100));
		panel.add(first);
		panel.add(second);
		panel.add(third);
		if (rand == rand2 && rand2 == rand3) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!");
		}
		frame.pack();
	}
  
}
