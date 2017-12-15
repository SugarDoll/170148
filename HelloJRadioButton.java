   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JButton;
   import javax.swing.JPanel;
   import javax.swing.JRadioButton;
   import javax.swing.ButtonGroup;

   import java.awt.BorderLayout;
   import java.awt.GridLayout;
   import java.awt.Container;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   
   public class HelloJRadioButton extends JFrame implements ActionListener{

      private JLabel label;
      private JRadioButton rbtn1;
      private JRadioButton rbtn2;
      private JRadioButton rbtn3;

      public void actionPerformed(ActionEvent e){

         Boolean kekka1 = this.rbtn1.isSelected();
         Boolean kekka2 = this.rbtn2.isSelected();
         Boolean kekka3 = this.rbtn3.isSelected();

         String msg ="";
         if (kekka1) {
            msg = this.rbtn1.getText()+"が選択されています";
            this.label.setText(msg); 
         }
         if (kekka2) {
            msg = this.rbtn2.getText()+"が選択されています";
            this.label.setText(msg);
         }
         if (kekka3) {
            msg = this.rbtn3.getText()+"が選択されています";
            this.label.setText(msg);
         }
      }



      HelloJRadioButton(String title){

      setTitle(title);
      setSize(960,540);
      setLocation(400,400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.rbtn1 = new JRadioButton("右");
      this.rbtn2 = new JRadioButton("左");
      this.rbtn3 = new JRadioButton("下");


      ButtonGroup rBtnGroup = new ButtonGroup();
      rBtnGroup.add(rbtn1);
      rBtnGroup.add(rbtn2);
      rBtnGroup.add(rbtn3);


      JButton btn = new JButton("くりっくみー");

      this.label = new JLabel("らべる");

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(5,1));
      panel.add(rbtn1);
      panel.add(rbtn2);
      panel.add(rbtn3);
      panel.add(btn);
      panel.add(this.label);

      Container cp = getContentPane();
      cp.add(panel,BorderLayout.NORTH);
      }

      public static void main(String[] args) {
         HelloJRadioButton frame = new HelloJRadioButton("Test");
         frame.setVisible(true);
      }
   }