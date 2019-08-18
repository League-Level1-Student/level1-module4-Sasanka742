package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine {
	
	JFrame frame = new JFrame();
	JPanel slot1 = new JPanel();
	JPanel slot2 = new JPanel();
	JPanel slot3 = new JPanel();
	
	JPanel main = new JPanel();
	
	public void run() throws MalformedURLException {
		
		JLabel one = createLabelImage("Clover-512.png");
		JLabel two = createLabelImage("images.jpeg");
		JLabel three = createLabelImage("26-263595_kevin-durant-tattoo-fruit-clip-art-png-download.jpeg");
		
		
		slot1.add(one);
		slot2.add(two);
		slot3.add(three);
		
		
		frame.setSize(500,200);
		frame.setVisible(true);
	
		
		
		
		slot1.setLayout(new BoxLayout(slot1, BoxLayout.PAGE_AXIS ));	
		main.add(slot1);
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		
		
		slot2.setLayout(new BoxLayout(slot2, BoxLayout.PAGE_AXIS ));
		main.add(slot2);
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		
		
		slot3.setLayout(new BoxLayout(slot3, BoxLayout.PAGE_AXIS ));
		main.add(slot3);	
		main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS ));
		
		frame.add(main);
		
		
		
		ArrayList<JLabel> slots = new ArrayList<JLabel>();
		
		slots.add(one);slots.add(two);slots.add(three);
		
		
		
		
	}
	
	
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	
	JLabel imageLabel = new JLabel(icon);
	imageLabel.setSize(40,40);
	return imageLabel;
	}
}
