import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest9_Event {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,300));
		
		//frame.add(panel);
		JTextField tfinput = new JTextField(10);
		//JButton button = new JButton("->");
		JButton button = new JButton("X 12");
		JLabel lbOutput = new JLabel();
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				String input = tfinput.getText();
//				lbOutput.setText("¾È³ç, "+input+"¾ß!");
				String input = tfinput.getText();
				int i = Integer.parseInt(input);
				String output = Integer.toString(i*12);
				lbOutput.setText(output);
			}
		};
		button.addActionListener(al);
		
		panel.add(tfinput);
		panel.add(button);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
