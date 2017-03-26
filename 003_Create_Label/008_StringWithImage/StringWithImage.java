/*
 * StringWithImage
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
class StringWithImage extends JFrame{

	/*コンストラクタ*/
	StringWithImage(String title){
		//フレームにタイトルを指定
		setTitle(title);
		//フレームの位置とサイズを指定
		setBounds(100, 100, 1050, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新規生成
		JPanel p = new JPanel();

		//イメージアイコンを新規生成  と イメージファイルを指定
		ImageIcon icon1 = new ImageIcon("./3.png");
		ImageIcon icon2 = new ImageIcon("./3.png");
		ImageIcon icon3 = new ImageIcon("./3.png");
		ImageIcon icon4 = new ImageIcon("./3.png");

		//ラベルを新規生成,文字とイメージアイコンとを両方指定
		JLabel label1 = new JLabel("board", icon1, JLabel.LEFT);
		//ラベルのサイズを指定
		label1.setPreferredSize(new Dimension(450,300));
		//枠線を指定
		label1.setBorder(new LineBorder(Color.blue, 2, true));

		//ラベルを新規生成,文字列を指定
		JLabel label2 = new JLabel("hasami");
		//ラベルにイメージアイコンを指定
		label2.setIcon(icon2);
		//ラベルのサイズを指定
		label2.setPreferredSize(new Dimension(450,300));
		//枠線を指定
		label2.setBorder(new LineBorder(Color.blue, 2, true));

		//ラベルを新規生成,イメージアイコンを指定
		JLabel label3 = new JLabel(icon3);
		//ラベルに文字列を指定
		label3.setText("bag");
		//ラベルのサイズを指定
		label3.setPreferredSize(new Dimension(450,300));
		//ラベルの枠線を設定
		label3.setBorder(new LineBorder(Color.blue, 2, true));

		//ラベルの新規生成,イメージアイコンを指定
		JLabel label4 = new JLabel(icon4);
		//ラベルに文字列を指定
		label4.setText("dentaku");
		//ラベルのサイズを指定
		label4.setPreferredSize(new Dimension(450,300));
		//ラベルの枠線を指定
		label4.setBorder(new LineBorder(Color.blue, 2, true));
		//文字列とイメージアイコンの水平位置を指定
		label4.setHorizontalAlignment(JLabel.RIGHT);
		//文字列とイメージアイコンの垂直位置を指定
		label4.setVerticalAlignment(JLabel.BOTTOM);

		//パネルにラベルを追加
		p.add(label1);
		p.add(label2);
		p.add(label3);
		p.add(label4);

		//content pane を新規生成
		Container contentPane = getContentPane();
		//content pane にパネルを追加。レイアウトを指定
		contentPane.add(p, BorderLayout.CENTER);
	}


	/*main メソッド*/
	public static void main(String args[]){
		StringWithImage frame = new StringWithImage("タイトル");
		frame.setVisible(true);
	}

}
