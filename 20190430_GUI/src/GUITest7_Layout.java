import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest7_Layout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("ÁýÀÌ¸§");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
//		FlowLayout fl=new FlowLayout();
//		fl.setAlignment(FlowLayout.RIGHT);
//		panel.setLayout(fl);
		
		BorderLayout bl= new BorderLayout();
		panel.setLayout(bl);
		JButton btNorth=new JButton("NORTH");
		JButton btWest=new JButton("WEST");
		JButton btCenter=new JButton("CENTER");
		JButton btEast=new JButton("EAST");
		JButton btSouth=new JButton("SOUTH");
		panel.add(btNorth, BorderLayout.NORTH);
		panel.add(btWest, BorderLayout.WEST);
		panel.add(btCenter, BorderLayout.CENTER);
		panel.add(btEast, BorderLayout.EAST);
		panel.add(btSouth, BorderLayout.NORTH);
		
		for(int i=0; i<10; i++) {
			JButton bt0=new JButton("Button "+i);
			panel.add(bt0);
		}
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
