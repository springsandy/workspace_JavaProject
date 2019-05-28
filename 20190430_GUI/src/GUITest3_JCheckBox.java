
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest3_JCheckBox {

	public static void main(String[] args) {
		JFrame frame=new JFrame("생일");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200));
		//frame.setSize(300,400);
		
		JPanel panel =new JPanel();
		JCheckBox cbChicken=new JcheckBox("치킨");
		
		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
