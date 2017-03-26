/*
 * ラベルのサイズと枠線の指定を行うサンプルコード
 */



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

class SizeBorder extends JFrame{

	/*コンストラクタ*/
	SizeBorder(String title){
		//フレームのタイトルを指定
		setTitle(title);
		//座標(横,縦)とサイズ(横,縦)を指定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラムの終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新しく生成
		JPanel p = new JPanel();

		//ラベルを新規作成
		JLabel label1 = new JLabel("今日の日付：");
		//ラベルのサイズの指定には、JLabelクラスの親クラスであるJComponentクラスで用意されているsetPreferredSizeメソッドを使う (横,縦)
		label1.setPreferredSize(new Dimension(100,100));
		//ラベルの枠線を設定するにはJLabelクラスの親クラスであるJComponentクラスで用意されているsetBorder メソッドを使う (色、太さ)
		label1.setBorder(new LineBorder(Color.BLUE, 4, true));

		//ラベルを新規作成
		JLabel label2 = new JLabel("21 Sep. 2009");
		//ラベルサイズの指定
		label2.setPreferredSize(new Dimension(200,50));
		//枠線の生成 (上の枠線とはまた違う見た目のボーダー)
		EtchedBorder border = new EtchedBorder(EtchedBorder.RAISED, Color.white, Color.black);
		//枠線を指定
		label2.setBorder(border);

		//パネルにラベルを追加
		p.add(label1);
		p.add(label2);

		//content paneを新規生成
		Container contentPane = getContentPane();
		//content paneにパネルを追加
		contentPane.add(p, BorderLayout.CENTER);
	}

	/*メインメソッド*/
	public static void main(String args[]){
		SizeBorder frame = new SizeBorder("タイトル");
		frame.setVisible(true);
	}

}
