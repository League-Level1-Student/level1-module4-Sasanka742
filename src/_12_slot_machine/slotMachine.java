package _12_slot_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel slot1 = new JPanel();
	JPanel slot2 = new JPanel();
	JPanel slot3 = new JPanel();
	
	JPanel main = new JPanel();
	
	JButton spin = new JButton("SPIN");
	
	ArrayList<JLabel> slots1;
	ArrayList<JLabel> slots2;
	ArrayList<JLabel> slots3;
	
	int num1;
	int num2;
	int num3;
	
	public void run() throws MalformedURLException {
		
		//
		JLabel one = createLabelImage("Clover-512.png");
		JLabel two = createLabelImage("images.jpeg");
		JLabel three = createLabelImage("26-263595_kevin-durant-tattoo-fruit-clip-art-png-download.jpeg");
		
		JLabel four = createLabelImage("Clover-512.png");
		JLabel five = createLabelImage("images.jpeg");
		JLabel six = createLabelImage("26-263595_kevin-durant-tattoo-fruit-clip-art-png-download.jpeg");
		
		JLabel seve = createLabelImage("Clover-512.png");
		JLabel eight = createLabelImage("images.jpeg");
		JLabel nine = createLabelImage("26-263595_kevin-durant-tattoo-fruit-clip-art-png-download.jpeg");
		
		slot1.add(one);
		slot2.add(two);
		slot3.add(three);
		
		main.add(spin);		
		spin.setLayout(new BoxLayout(spin, BoxLayout.Y_AXIS));
		
		spin.addActionListener(this);
		
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
		
		
		
		slots1 = new ArrayList<JLabel>();
		slots1.add(one);slots1.add(two);slots1.add(three);
		
		slots2 = new ArrayList<JLabel>();
		slots2.add(four);slots2.add(five);slots2.add(six);
		
		slots3 = new ArrayList<JLabel>();
		slots3.add(seve);slots3.add(eight);slots3.add(nine);
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




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==spin) {
				slot1.removeAll();
				slot2.removeAll();
				slot3.removeAll();
				
				for(int i=0;i<1;i++) {
					 num1 = new Random().nextInt(3); 
					 slot1.add(slots1.get(num1));				 
					 frame.pack();
					 
					 
					 num2 = new Random().nextInt(3); 
					 slot2.add(slots2.get(num2));
					 frame.pack();
					 
					 num3 = new Random().nextInt(3);
					 slot3.add(slots3.get(num3));				 
					 frame.pack();
					 
					 if(num1==num2&&num2==num3) {
						 JOptionPane.showMessageDialog(null, "YOU WIN!!!!!");
						 AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
						 sound.play();
					 }
				}
				
				
				
		}
	}
	
}
