/*
 * パネルにコンポーネントを追加するサンプルコード
 *
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

/*JFrameを継承したクラス*/
class AddComponentToPanel extends JFrame{

	/*コンストラクタ*/
	AddComponentToPanel(String title){
		//フレームのタイトル設定
		setTitle(title);
		//フレームの座標とサイズ設定
		setBounds(100, 100, 300, 250);
		//×でプログラム終了を設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//レイアウト設定
		setLayout(new FlowLayout());

		//パネルを新しく生成
		JPanel p = new JPanel();
		//パネルのサイズ設定
		p.setPreferredSize(new Dimension(200, 100));
		//パネルの背景色を設定
		p.setBackground(Color.ORANGE);

		//ラベルを新しく生成
		JLabel label = new JLabel("入場者数");
		//テキストフィールドを新しく生成 引数は何？？
		JTextField text = new JTextField(5);

		//パネルにラベルとテキストフィールドを追加
		p.add(label);
		p.add(text);

		//content paneを新しく生成
		Container contentPane = getContentPane();
		//content paneにパネルを追加
		contentPane.add(p);
	}

	/*メインメソッド*/
	public static void main(String args[]){
		AddComponentToPanel frame = new AddComponentToPanel("タイトル");
		frame.setVisible(true);
	}




}
