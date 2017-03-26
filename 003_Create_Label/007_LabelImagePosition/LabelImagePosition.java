/*
 * LabelImagePosition
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

/*JFrameを継承したクラス*/
class LabelImagePosition extends JFrame{

	/*コンストラクタ*/
	LabelImagePosition(String title){
		//フレームにタイトルを指定
		setTitle(title);
		//フレームのサイズと座標を指定
		setBounds(100, 100, 900, 650);
		//×ボタンでプログラムの終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新規生成
		JPanel p = new JPanel();

		//イメージアイコンを新規生成とファイルの指定
		ImageIcon icon1 = new ImageIcon("./4762bfaf.png");
		ImageIcon icon2 = new ImageIcon("./3.png");
		ImageIcon icon3 = new ImageIcon("./t02200190_0259022413595810243.png");

		//ラベルの新規生成
		JLabel label1 = new JLabel(icon1);
		//ラベルのサイズ指定
		label1.setPreferredSize(new Dimension(300,300));
		//!!文字列の位置設定と同じ方法!!
		//画像の水平方向の位置指定
		label1.setHorizontalAlignment(JLabel.LEFT);
		//画像の垂直方向の位置指定
		label1.setVerticalAlignment(JLabel.TOP);
		//ラベルの枠線を設定
		label1.setBorder(new LineBorder(Color.blue, 2, true));


		JLabel label2 = new JLabel();
		label2.setIcon(icon2);
		label2.setPreferredSize(new Dimension(300,300));
		label2.setHorizontalAlignment(JLabel.RIGHT);
		label2.setVerticalAlignment(JLabel.BOTTOM);
		label2.setBorder(new LineBorder(Color.green, 2, true));


		//文字列の場合は、デフォルトの位置は、水平方向は左、垂直方向は中央
		//画像の場合は、デフォルトの位置は、水平方向も垂直方向も中央
		JLabel label3 = new JLabel(icon3);
		label3.setPreferredSize(new Dimension(300,300));
		label3.setBorder(new LineBorder(Color.red, 2, true));

		p.add(label1);
		p.add(label2);
		p.add(label3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*mainメソッド*/
	public static void main(String args[]){
		LabelImagePosition frame = new LabelImagePosition("タイトル");
		frame.setVisible(true);
	}

}

