/*
 * ラベルに画像を設定するサンプルコード
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;

/*JFrameを継承したクラス*/
class Image extends JFrame{

	/*コンストラクタ*/
	Image(String title){
		//フレームのタイトルを指定
		setTitle(title);
		//フレームのサイズと座標を指定
		setBounds(100, 100, 650, 350);
		//×ボタンでプログラムの終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新規生成
		JPanel p = new JPanel();

		//画像アイコンを新規生成 (ファイル名を引数で指定)
		ImageIcon icon1 = new ImageIcon("./4762bfaf.png");
		ImageIcon icon2 = new ImageIcon("./3.png");

		//ラベルを新規生成して、画像を指定
		JLabel label1 = new JLabel(icon1);

		/*
		 * ^
		 * | どちらも同じ
		 * v
		 */

		//ラベルを新規生成
		JLabel label2 = new JLabel();
		//画像を指定
		label2.setIcon(icon2);

		//パネルにラベルを指定
		p.add(label1);
		p.add(label2);

		//content Pane を新規生成
		Container contentPane = getContentPane();
		//content Pane にパネルを指定。レイアウトを指定
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*メインメソッド*/
	public static void main(String args[]){
		Image frame = new Image("タイトル");
		//フレームの表示
		frame.setVisible(true);
	}

}
