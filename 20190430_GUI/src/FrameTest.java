import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame=new JFrame("��");
		JLabel label=new JLabel("���̺�");
		frame.add(label);
		
		frame.setPreferredSize(new Dimension(400,100));
		frame.setLocation(200,500);
		
		frame.pack();
		frame.setVisible(true);
		
		JFrame frame2=new JFrame("â��");
		frame2.pack();
		frame2.setVisible(true);
	}

}