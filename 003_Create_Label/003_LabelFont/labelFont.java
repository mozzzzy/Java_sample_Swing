/*
 * Labelの文字列のfontを指定
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Container;
import java.awt.BorderLayout;

/*JFrameを継承したクラス*/
class labelFont extends JFrame{

	/*コンストラクタ*/
	labelFont(String title){
		//フレームにタイトルを指定
		setTitle(title);
		//フレームの座標(横,縦)とサイズ(横,縦)を指定
		setBounds(500, 200, 500, 550);
		//×ボタンでプログラムの終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新しく生成
		JPanel p = new JPanel();

		//labelを新しく生成
		JLabel label1 = new JLabel("今日の日付：");
		label1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 12));

		//labelを新しく生成
		JLabel label2 = new JLabel("21 Sep. 20091");
		label2.setFont(new Font("Century", Font.ITALIC, 24));

		//パネルにlabelを追加
		p.add(label1);
		p.add(label2);

		//content paneを新しく生成
		Container contentPane = getContentPane();
		//content paneにパネルを追加
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*メインメソッド*/
	public static void main(String args[]){
		labelFont frame = new labelFont("タイトル");
		frame.setVisible(true);
	}
}
