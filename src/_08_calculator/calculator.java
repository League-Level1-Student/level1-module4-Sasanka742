package _08_calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class calculator implements ActionListener, Runnable {
	private int first;
	private int second;
	
	//boxlayout

	
	
	//frames and panels
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel main = new JPanel();
	JLabel label = new JLabel(); 
	
	
	//inputs
	JTextField intOne = new JTextField(10);
	JTextField intTwo = new JTextField(10);
	
	//answer
	
	
	//buttons
	JButton add = new JButton("Add");
	JButton sub = new JButton("Sub");
	JButton mul = new JButton("Mul");
	JButton div = new JButton("Div");
	
	public void run() {
		//button panel
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		
		
		//input panel
	

		panel2.add(intOne);
		panel2.add(intTwo);
		
		//answer panel
		
		panel3.add(label);
		
		//main panel

		main.add(panel2);
		main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
		main.add(panel);
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS));
		main.add(panel3);
		main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
	
		
		
		//frame
		frame.add(main);
		frame.setSize(400,200);
		frame.setVisible(true);
		
		
		//listeners
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		//getText
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		first = Integer.parseInt(intOne.getText());
	    second = Integer.parseInt(intTwo.getText());
		
	    label.setSize(20,5);
	    
		if(e.getSource()==add){
			label.setText(first+second+"");
		}else if(e.getSource()==sub) {
			label.setText(first-second+"");
		}else if(e.getSource()==mul) {
			label.setText(first*second+"");
		}else if(e.getSource()==div) {
			label.setText(first/second+"");
		}
		
	}
	
	
}
