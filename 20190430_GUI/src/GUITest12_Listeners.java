import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest12_Listeners {

	static int computer;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300, 200));
		
		JPanel panel = new JPanel();
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		JLabel lbOutput = new JLabel("�� ����!");
		
		tfInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" �컶��!!!");
			}
		});
		tfInput.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				lbOutput.setText("�ٽ� ���ƿ̤ͤ�");
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				lbOutput.setText("���� �ٶ�� 0.0");
			}
		});
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}