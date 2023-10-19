package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static int ans = 0;
	static int missed = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void run() {
		Date timeAtStart = new Date();
		frame.setVisible(true);
		Random rand = new Random();
		int random = rand.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			if (random == i) {
				button.setText("mole!");
			}
			panel.add(button);
		}
		frame.add(panel);
		frame.setPreferredSize(new Dimension(300, 400));
		if (missed == 5) {
			speak("YOU LOST!!!");
			endGame(timeAtStart, ans);
		}
		if (ans == 10) {
			endGame(timeAtStart, ans);
		}
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton check = (JButton) e.getSource();
		if (check.getText().equals("mole!")) {
			ans++;
			playSound("b.wav");
		}
		else {
			speak("YOU MISSED!");
		}
		frame.remove(panel);
		JPanel panel1 = new JPanel();
		Random rand = new Random();
		int random = rand.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			if (random == i) {
				button.setText("mole!");
			}
			panel1.add(button);
		}
		frame.add(panel1);
		frame.setPreferredSize(new Dimension(300, 400));
		frame.pack();
	}
    static void speak(String words) {
    	missed++;
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
    private void endGame(Date timeAtStart, int molesWhacked) { 
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                      + " moles per second.");
    }
    @SuppressWarnings("deprecation")
	private void playSound(String fileName) { 
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
        sound.play();
    }
}