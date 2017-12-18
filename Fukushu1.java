import javax.swing.*;

import java.awt.*;

class Fukushu1 extends JFrame{
  public static void main(String args[]){
    Fukushu1 frame = new Fukushu1("タイトル");
    frame.setVisible(true);
  }

  Fukushu1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
    JPanel p = new JPanel();
//---------------チェックボックス---------------
   


    JCheckBox ckbox1 = new JCheckBox("top");
    JCheckBox ckbox2 = new JCheckBox("mid");
    JCheckBox ckbox3 = new JCheckBox("bot");
    //ckbox3.setText("✔");

    p.add(ckbox1);
    p.add(ckbox2);
    p.add(ckbox3);
//---------------チェックボックス---------------

//---------------ラジオボタン---------------
    JRadioButton radio1 = new JRadioButton("@1");
    JRadioButton radio2 = new JRadioButton("@2");
    JRadioButton radio3 = new JRadioButton("@3");
    //radio3.setText("☆彡");

    p.add(radio1);
    p.add(radio2);
    p.add(radio3);

//---------------ラジオボタン---------------


//---------------Menu---------------
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Help");
    

    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(menu3);

    //↓ Menu選択
    JMenuItem menuitem1 = new JMenuItem("New");
    JMenuItem menuitem2 = new JMenuItem("Open");
    JMenuItem menuitem3 = new JMenuItem("Close");

    JMenuItem menuitem4 = new JMenuItem("cut");
    JMenuItem menuitem5 = new JMenuItem("copy");
    JMenuItem menuitem6 = new JMenuItem("paste");

    JMenuItem menuitem7 = new JMenuItem("version");
    JMenuItem menuitem8 = new JMenuItem("index");

    menu1.add(menuitem1);
    menu1.add(menuitem2);
    menu1.add(menuitem3);

    menu2.add(menuitem4);
    menu2.add(menuitem5);
    menu2.add(menuitem6);

    menu3.add(menuitem7);
    menu3.add(menuitem8);

    //↑ Menu選択

    setJMenuBar(menubar);

//---------------Menu---------------

    //JPanel p = new JPanel();

    JButton button = new JButton("button");
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}