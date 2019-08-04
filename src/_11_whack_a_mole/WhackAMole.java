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
	
	Date time =new Date();
	
	JFrame frame = new JFrame("Whack A Button");
	JPanel col1 = new JPanel();
	JPanel col2 = new JPanel();
	JPanel col3 = new JPanel();
	
	JPanel main = new JPanel();
	
	//column 1
	JButton a1 = new JButton();
	JButton a2 = new JButton();
	JButton a3 = new JButton();
	JButton a4 = new JButton();
	JButton a5 = new JButton();
	JButton a6 = new JButton();
	JButton a7 = new JButton();
	JButton a8 = new JButton();
	
	//column 2
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	
	//column 3
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JButton c4 = new JButton();
	JButton c5 = new JButton();
	JButton c6 = new JButton();
	JButton c7 = new JButton();
	JButton c8 = new JButton();
	
	public void run() {
		
		frame.setSize(250,300);
		
		//insert buttons in columns
		col1.add(a1);col1.add(a2);col1.add(a3);col1.add(a4);
		col1.add(a5);col1.add(a6);col1.add(a7);col1.add(a8);
		

		col2.add(b1);col2.add(b2);col2.add(b3);col2.add(b4);
		col2.add(b5);col2.add(b6);col2.add(b7);col2.add(b8);
		
		col3.add(c1);col3.add(c2);col3.add(c3);col3.add(c4);
		col3.add(c5);col3.add(c6);col3.add(c7);col3.add(c8);
		
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
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//adds all the buttons to a list
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		buttons.add(a1);buttons.add(a2);buttons.add(a3);buttons.add(a4);
		buttons.add(a5);buttons.add(a6);buttons.add(a7);buttons.add(a8);
		
		buttons.add(b1);buttons.add(b2);buttons.add(b3);buttons.add(b4);
		buttons.add(b5);buttons.add(b6);buttons.add(b7);buttons.add(b8);
		
		buttons.add(c1);buttons.add(c2);buttons.add(c3);buttons.add(c4);
		buttons.add(c5);buttons.add(c6);buttons.add(c7);buttons.add(c8);
		
		for(int i=0;i<1;i++) {
			int num = new Random().nextInt(25);
			buttons.get(num).setText("mole!");
			for(JButton button: buttons) {
				button.addActionListener(this);
			}
		}
		
		
	}
	
	public void drawButton(int num) {
		run();
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		
		if(clicked.getText().equals("mole!")) {
			score++;
			frame.dispose();
			clicked.setText("");
			run();
			
		}else {
			speak("Missed!");
			missed++;
			frame.getDefaultCloseOperation();
		}
		
	
		
	}
	
	void speak(String words) {
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
