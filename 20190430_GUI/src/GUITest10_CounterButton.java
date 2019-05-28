

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest10_CounterButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter Button");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300,100));

		JLabel lbNumber = new JLabel("0");
		JButton  btCount = new JButton("Click Counter");
		
		panel.add(lbNumber);
		panel.add(btCount);
		
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
