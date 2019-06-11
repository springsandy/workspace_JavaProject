import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest11_UpDown {

	static int computer;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("���شٿ���شٿ�");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		//JTextField, JButton
		JTextField tfInput = new JTextField(10);
		JButton btQestion = new JButton("�̳�?");
		//JLabel
		JLabel lbResult = new JLabel("1~100���� ���� �����");
		Random random = new Random();
		computer = random.nextInt(100)+1;
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//������Է°� ��������
				String input = tfInput.getText();
				int player = Integer.parseInt(input);
				//��ǻ�Ͱ��̶� ������
				//��� ��������
				if(computer > player) {
					lbResult.setText("Up");
				} else if (computer < player) {
					lbResult.setText("Down");
				} else {
					lbResult.setText("�����Դϴ�.");
					computer = random.nextInt(100)+1;
				}

			}
		};
		btQestion.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btQestion);
		panel.add(lbResult);
		frame.add(panel); 
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}