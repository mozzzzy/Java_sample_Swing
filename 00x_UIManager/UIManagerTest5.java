/*
 * やりたいのはhttp://www.javadrive.jp/tutorial/uimanager/
 */


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Vector;

public class UIManagerTest5 extends JFrame{

  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);

    UIManagerTest5 frame = new UIManagerTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  UIManagerTest5(){

    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
