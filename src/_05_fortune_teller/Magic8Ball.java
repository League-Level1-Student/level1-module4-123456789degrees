package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String args[]) {
		int rand = new Random().nextInt(4);
		System.out.println(rand);
		String question = JOptionPane.showInputDialog("The Magic 8 Ball is waiting for your question...");
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Yeah, probably.");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Overlook not so good.");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "I am unsure about this one. Maybe ask Google?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get a life and don't ask me another question ever again!");
		}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
