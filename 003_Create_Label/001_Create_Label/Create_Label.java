/*
 * JLabelクラスを使ってラベルを作成するサンプルコード。
 * ラベルは編集できない文字列を表示するのに主に使われるが、文字列だけではなく画像も表示することができる。
 * ここではラベルの使い方について確認していく。
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;

/*JFrameを継承したクラス*/
class Create_Label extends JFrame{

	/*コンストラクタ*/
	Create_Label(String title){
		//タイトルの指定
		setTitle(title);
		//座標とサイズの指定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラム終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//新しいパネルを生成
		JPanel p = new JPanel();

		//ラベルを新しく生成 & 文字列を設定
		JLabel label1 = new JLabel("今日の天気：");

		//ラベルを新しく生成
		JLabel label2 = new JLabel();
		//文字列を設定
		label2.setText("晴れのち曇り");

		//パネルにラベルを追加
		p.add(label1);
		p.add(label2);

		//content pane  を新しく生成
		Container contentPane = getContentPane();
		//content pane にパネルを追加
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*メインメソッド*/
	public static void main(String args[]){
		Create_Label frame = new Create_Label("タイトル");
		frame.setVisible(true);
	}

}
