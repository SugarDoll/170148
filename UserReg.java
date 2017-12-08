import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class UserReg extends JFrame{
	public static void main(String[] args) {
		
	UserReg frame = new UserReg("うぃんどう");
	frame.setVisible(true);				
	}

	UserReg(String title){
		setTitle(title);
		setBounds(100, 100, 300, 250);
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));

		JLabel label1 = new JLabel("めーる");
		JLabel label2 = new JLabel("ぱすわーど");

		JTextField text1 = new JTextField(10);

		JPasswordField pass = new JPasswordField(10);

		p.add(label1);
		p.add(text1);
		p.add(label2);
		p.add(pass);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}