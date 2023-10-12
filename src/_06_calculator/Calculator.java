package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JLabel label = new JLabel();
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		div.setText("div");
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public float div(int a, int b) {
		return a / b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = text1.getText();
		String s2 = text2.getText();
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		if (e.getSource() == add) {
			String bruh = add(i1, i2) + "";
			label.setText(bruh);
		}
		else if (e.getSource() == sub) {
			label.setText(sub(i1, i2) + "");
		}
		else if (e.getSource() == mul) {
			label.setText(mul(i1, i2) + "");
		}
		else {
			label.setText(div(i1, i2) + "");
		}
	}
}
