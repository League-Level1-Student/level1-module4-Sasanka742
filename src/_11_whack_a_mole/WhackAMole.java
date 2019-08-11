package _11_whack_a_mole;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackAMole implements ActionListener {
	int score = 0;
	int tries = 0;
	int missed = 0;
	
	Date time;
	
	JFrame frame = new JFrame("Whack A Button");
	JPanel col1 = new JPanel();
	JPanel col2 = new JPanel();
	JPanel col3 = new JPanel();
	
	JPanel main = new JPanel();
	
	
	
	public void run() {
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		for(int i=0;i<24;i++) {
			JButton button = new JButton();
			buttons.add(button);
			button.setText("");
			if(i<8) {
				col1.add(button);
			}else if(i>7&&i<16) {
				col2.add(button);
			}else if(i>15) {
				col3.add(button);
			}
			button.addActionListener(this);
		}
		
		frame.setSize(250,300);

		
		/**for()
		* JButton temp;
		* temp.addAction
		* panel.add(temp)
		*
		*/
		
		
		//layout the columns
		col1.setLayout(new BoxLayout(col1, BoxLayout.PAGE_AXIS ));	
		main.add(col1);
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		
		
		col2.setLayout(new BoxLayout(col2, BoxLayout.PAGE_AXIS ));
		main.add(col2);
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		
		
		col3.setLayout(new BoxLayout(col3, BoxLayout.PAGE_AXIS ));
		main.add(col3);	
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		

		//add main panel to frame	
		frame.add(main);
		frame.setVisible(true);
		time = new Date();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		for(int i=0;i<1;i++) {
			int num = new Random().nextInt(24);
			buttons.get(num).setText("mole!");
		}		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		
		if(missed+score==10) {
			endGame(time,score);
			frame.dispose();
			missed=0;
			score=0;
			
		}else {
		
			if(clicked.getText().equals("")) {
				speak("Missed!");
				missed++;
				System.out.println(missed);
				col1.removeAll();
				col2.removeAll();
				col3.removeAll();
				main.removeAll();
				for(int i=0;i<1;i++) {
					run();
				}
			}
			
			if(clicked.getText().equals("mole!")) {
				score++;
				clicked.setText("");
				speak("Correct!");
				col1.removeAll();
				col2.removeAll();
				col3.removeAll();
				main.removeAll();
				for(int i=0;i<1;i++) {
					run();
				}
			}
		}
	}
	
	public void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	//insert all buttons in a list
	
	// make a for loop for the array . get a random number in the list(position)
	// set the result item of list's name to "mole!"
	//also make a enhanced loop that adds action listener to all buttons in the array

	//if the 
	
	
}
