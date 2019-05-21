import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_ImageIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));

		ImageIcon kirby= new ImageIcon("src/images/1.jpg");
		JLabel imageLabel= new JLabel(kirby);
		
		ImageIcon picachu= new ImageIcon("src/images/1.jpg");
		ImageIcon smallPicachu= new ImageIcon(picachu.getImage(),getScaledInstane(200, 200, Image.SCALE_DEFAULT));
		JButton imagebutton= new JButton(picachu);
		
		panel.add(imageLabel);
		panel.add(imagebutton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static String getScaledInstane(int i, int j, int scaleDefault) {
		// TODO Auto-generated method stub
		return null;
	}

}
