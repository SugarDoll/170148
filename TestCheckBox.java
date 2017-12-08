  import javax.swing.*;
  import java.awt.*;
   
  public class TestCheckBox extends JFrame{
   TestCheckBox(String title){
   	setTitle(title);
   	setSize(800,800);
   	setLocation(0,0);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
          JPanel panel = new JPanel();
     
          JCheckBox c1 = new JCheckBox("A");
          JCheckBox c2 = new JCheckBox("B");
          JCheckBox c3 = new JCheckBox("C");
           
          panel.add(c1);
          panel.add(c2);
          panel.add(c3);
           
          Container cp = getContentPane();
          cp.add(panel,BorderLayout.NORTH);
          }
    public static void main(String args[]){
      	TestCheckBox tx = new TestCheckBox("window");
        tx.setVisible(true);
      
    } 
  }
           