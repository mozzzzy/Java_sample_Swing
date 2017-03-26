/*
 * ラベル内の文字列の位置を調整するサンプルコード
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

/*JFrameを継承したクラス*/
class fontPosition extends JFrame{

	/*コンストラクタ*/
	fontPosition(String title){
		//フレームにタイトルを設定
		setTitle(title);
		//フレームの位置とサイズを指定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラムを終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新規生成
		JPanel p = new JPanel();

		//ラベルを新規生成 と 文字列の指定
		JLabel label1 = new JLabel("LEFT/TOP");
		//ラベルのサイズ指定
		label1.setPreferredSize(new Dimension(130,80));
		//ラベル内の文字列の水平方向の位置を指定
		label1.setHorizontalAlignment(JLabel.LEFT);
		//ラベル内の文字列の垂直方向の位置を指定
		label1.setVerticalAlignment(JLabel.TOP);
		//ラベルの枠線の指定
		label1.setBorder(new LineBorder(Color.blue, 2, true));

		//同様にラベルを新規生成 と 文字列の指定
		JLabel label2 = new JLabel("RIGHT/BOTTOM");
		label2.setPreferredSize(new Dimension(130,80));
		//ラベル内の文字列の水平方向の位置を指定
		label2.setHorizontalAlignment(JLabel.RIGHT);
		//ラベル内の文字列の垂直方向の位置を指定
		label2.setVerticalAlignment(JLabel.BOTTOM);
		label2.setBorder(new LineBorder(Color.blue, 2, true));

		//同様にラベルを新規生成 と 文字列の指定
		JLabel label3 = new JLabel("DEFAULT");
		label3.setPreferredSize(new Dimension(130,80));
		label3.setBorder(new LineBorder(Color.blue, 2, true));

		//パネルに各ラベルを追加
		p.add(label1);
		p.add(label2);
		p.add(label3);

		//content Pane を新規生成
		Container contentPane = getContentPane();
		//content Pane にパネルを追加. レイアウトも指定
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*main メソッド*/
	public static void main(String args[]){
		fontPosition frame = new fontPosition("タイトル");
		//フレームの表示
		frame.setVisible(true);
	}

}
