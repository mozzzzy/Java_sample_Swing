/*
 * PositionBetweenStringAndImage
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

class PositionBetweenStringAndImage extends JFrame{
  public static void main(String args[]){
    PositionBetweenStringAndImage frame = new PositionBetweenStringAndImage("タイトル");
    frame.setVisible(true);
  }

  PositionBetweenStringAndImage(String title){
    setTitle(title);
    setBounds(100, 100, 350, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    ImageIcon icon1 = new ImageIcon("./board.png");
    ImageIcon icon2 = new ImageIcon("./hasami.png");
    ImageIcon icon3 = new ImageIcon("./bag.png");
    ImageIcon icon4 = new ImageIcon("./dentaku.png");

    JLabel label1 = new JLabel("board", icon1, JLabel.CENTER);
    label1.setPreferredSize(new Dimension(100,80));
    label1.setBorder(new LineBorder(Color.blue, 2, true));
    label1.setHorizontalTextPosition(JLabel.LEFT);
    label1.setVerticalTextPosition(JLabel.TOP);

    JLabel label2 = new JLabel("board", icon1, JLabel.CENTER);
    label2.setPreferredSize(new Dimension(100,80));
    label2.setBorder(new LineBorder(Color.blue, 2, true));
    label2.setHorizontalTextPosition(JLabel.LEFT);
    label2.setVerticalTextPosition(JLabel.CENTER);

    JLabel label3 = new JLabel("board", icon1, JLabel.CENTER);
    label3.setPreferredSize(new Dimension(100,80));
    label3.setBorder(new LineBorder(Color.blue, 2, true));
    label3.setHorizontalTextPosition(JLabel.LEFT);
    label3.setVerticalTextPosition(JLabel.BOTTOM);

    JLabel label4 = new JLabel("board", icon2, JLabel.CENTER);
    label4.setPreferredSize(new Dimension(100,80));
    label4.setBorder(new LineBorder(Color.blue, 2, true));
    label4.setHorizontalTextPosition(JLabel.LEFT);
    label4.setVerticalTextPosition(JLabel.CENTER);

    JLabel label5 = new JLabel("board", icon2, JLabel.CENTER);
    label5.setPreferredSize(new Dimension(100,80));
    label5.setBorder(new LineBorder(Color.blue, 2, true));
    label5.setHorizontalTextPosition(JLabel.CENTER);
    label5.setVerticalTextPosition(JLabel.CENTER);

    JLabel label6 = new JLabel("board", icon2, JLabel.CENTER);
    label6.setPreferredSize(new Dimension(100,80));
    label6.setBorder(new LineBorder(Color.blue, 2, true));
    label6.setHorizontalTextPosition(JLabel.RIGHT);
    label6.setVerticalTextPosition(JLabel.CENTER);

    JLabel label7 = new JLabel("board", icon3, JLabel.CENTER);
    label7.setPreferredSize(new Dimension(150,80));
    label7.setBorder(new LineBorder(Color.blue, 2, true));

    JLabel label8 = new JLabel("board", icon3, JLabel.CENTER);
    label8.setPreferredSize(new Dimension(150,80));
    label8.setBorder(new LineBorder(Color.blue, 2, true));
    label8.setIconTextGap(20);

    p.add(label1);
    p.add(label2);
    p.add(label3);
    p.add(label4);
    p.add(label5);
    p.add(label6);
    p.add(label7);
    p.add(label8);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
