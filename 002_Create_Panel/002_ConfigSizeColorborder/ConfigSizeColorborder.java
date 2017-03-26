/*
 * panelのサイズ、色、枠線の指定をするサンプルコード
 *
 *
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

class ConfigSizeColorborder extends JFrame{

	/*コンストラクタ*/
	ConfigSizeColorborder(String title){
		//フレームのタイトルの設定
		setTitle(title);
		//フレームのサイズと表を指定
		setBounds(100, 100, 300, 250);
		//×を押したらプログラム終了を設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//レイアウトを指定 FlowLayout	これは初めて出てきたきがするけど説明は後述？？
		//レイアウトマネージャによっては、サイズを指定しても、自動でサイズが決まってしまうものもある
		setLayout(new FlowLayout());

		//パネルを新しく生成
		JPanel p1 = new JPanel();
		//サイズ指定
		p1.setPreferredSize(new Dimension(100, 50));
		//背景色指定
		p1.setBackground(Color.BLUE);

		//パネルを新しく生成
		JPanel p2 = new JPanel();
		//サイズ指定
		p2.setPreferredSize(new Dimension(50, 100));
		//背景色指定
		p2.setBackground(Color.ORANGE);

		//枠線指定
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		//p2パネルに枠線を設定
		p2.setBorder(border);

		//content paneを新しく生成
		Container contentPane = getContentPane();
		//content paneにp1パネルを追加
		contentPane.add(p1);
		//content paneにp2パネルを追加
		contentPane.add(p2);
	}


	/*mainメソッド*/
	public static void main(String args[]){
		ConfigSizeColorborder frame = new ConfigSizeColorborder("タイトル");
		frame.setVisible(true);
	}
}
