import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.BorderLayout;

class TestJPasswordField extends JFrame{
	public static void main(String[] args) {
		
	TestJPasswordField frame = new TestJPasswordField("うぃんどう");
	frame.setVisible(true);				
	}

	TestJPasswordField(String title){
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel p = new JPanel();

		JPasswordField pass = new JPasswordField(10);

		p.add(pass);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}