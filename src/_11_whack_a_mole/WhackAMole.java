package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhackAMole {
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
		
	}
	
	public void drawButton(int num) {
		run();
		
		
		
	}
	
	//insert all buttons in a list
	
	// make a for loop for the array . get a random number in the list(position)
	// set the result item of list's name to "mole!"
	//also make a enhanced loop that adds action listener to all buttons in the array

	//if the 
	
	
}
