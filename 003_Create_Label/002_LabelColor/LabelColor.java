/*
 * Labelの背景色、前景色の設定と、透明/非透明の切り替え
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;

class LabelColor extends JFrame{

	/*コンストラクタ*/
	LabelColor(String title){
		//タイトルの指定
		setTitle(title);
		//座標とサイズの指定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラムの終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新しく生成
		JPanel p = new JPanel();

		//ラベルを新しく生成
		JLabel label1 = new JLabel("今日の天気：");
		//前景色を指定
		label1.setForeground(Color.BLUE);
		//背景色を指定
		label1.setBackground(Color.BLACK);

		//ラベルを新しく生成
		JLabel label2 = new JLabel("晴れのち曇り");
		//前景色を指定
		label2.setForeground(Color.ORANGE);
		//背景色を指定
		label2.setBackground(Color.WHITE);
		//setOpaqueでtrueを設定すると非透明になり、falseを設定すると透明になります
		label2.setOpaque(true);

		//パネルにラベルを追加
		p.add(label1);
		p.add(label2);

		//content pane を新しく生成
		Container contentPane = getContentPane();
		//content pane にパネルを指定
		contentPane.add(p, BorderLayout.CENTER);
	}

	/*メインメソッド*/
	public static void main(String args[]){
		LabelColor frame = new LabelColor("タイトル");
		frame.setVisible(true);
	}




}
