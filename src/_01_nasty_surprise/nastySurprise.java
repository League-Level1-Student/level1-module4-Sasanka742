package _01_nasty_surprise;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;


public class nastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		nastySurprise surprise = new nastySurprise();
		surprise.run();
	}
	
	
	public void run() {
		trick.addActionListener(this);
		treat.addActionListener(this);
		panel.add(treat);
		panel.add(trick);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}

	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
// TODO Auto-generated method stub
JButton buttonPressed = (JButton) arg0.getSource();
		
		if(arg0.getSource()==trick){
			showPictureFromTheInternet("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12231413/Labrador-Retriever-MP.jpg");
		}else if(arg0.getSource()==treat){
			showPictureFromTheInternet("http://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
		}
	}


	
}

