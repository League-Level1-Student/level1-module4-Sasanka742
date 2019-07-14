package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	private int first;
	private int second;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel(); 
	
	//inputs
	JTextField intOne = new JTextField();
	JTextField intTwo = new JTextField();
	
	//buttons
	JButton add = new JButton("Add");
	
	JButton sub = new JButton("Sub");
	JButton mul = new JButton("Mul");
	JButton div = new JButton("Div");
	
	public void run() {
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}

	public int addition() {
		first = Integer.parseInt(intOne.getText());
		second = Integer.parseInt(intTwo.getText());
		//label.setText(add(a,b)+"");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
