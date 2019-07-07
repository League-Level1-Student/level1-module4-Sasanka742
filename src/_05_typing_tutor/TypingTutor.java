package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	int correct = 0;
	int totalNumber = 0;
	char currentLetter;
	JFrame frame;
	JLabel label; 
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26)+ 'a');
	}
	
	public void run() {
		currentLetter = generateRandomLetter();
		frame = new JFrame();
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		label = new JLabel();
		frame.add(label);
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	
	
		frame.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("You typed: "+ e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct");
			correct++;
			totalNumber++;
			frame.setBackground(new Color(50,205,50));
		}else {
			frame.setBackground(new Color(255,0,0));
			totalNumber++;
		}
		if(totalNumber>120) {
			showTypingSpeed(correct);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		//label.setFont(label.getFont().deriveFont(28.0f));
	   //label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	
	}
	
	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 

	
	
}
