import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest_JFrame {

	public static void main(String[] args) {
		JFrame frame=new JFrame("â�̸�");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200));
		//frame.setSize(300,400);
		
		JPanel panel=new JPanel();
		JLabel label=new JLabel("������ Ǫ������~");
		JLabel label2=new JLabel("�츮���� �ڶ���~");
		
		panel.add(label);
		panel.add(label2);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
