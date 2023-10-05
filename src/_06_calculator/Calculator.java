package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JButton add = new JButton();
		add.setText("add");
		JButton sub = new JButton();
		sub.setText("sub");
		JButton mul = new JButton();
		mul.setText("mul");
		JButton div = new JButton();
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		div.setText("div");
		frame.add(text1);
		frame.add(text2);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
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
		
	}
}
