/*
rderLayout;
 * 
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;


class LayoutManager extends JFrame{

	/*コンストラクタ*/
	LayoutManager(String title){

		//タイトルを設定
		setTitle(title);
		//座標とサイズを設定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラム終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//レイアウトを指定してレイアウトマネージャーのオブジェクトを新規生成
		setLayout(new FlowLayout());

		/*パネルを新しく作成*/
		//パネルのオブジェクト生成
		JPanel p = new JPanel();
		//サイズ指定
		p.setPreferredSize(new Dimension(200, 100));
		//オレンジ色を指定
		p.setBackground(Color.ORANGE);
		//パネルのレイアウトを指定
		p.setLayout(new BorderLayout());

		//ボタンオブジェクトの新規生成
		JButton btn1 = new JButton("NORTH");
		//ボタンオブジェクトの新規生成
		JButton btn2 = new JButton("SOUTH");
		//パネルに2つのボタンを追加
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.SOUTH);

		//content paneを新規生成
		Container contentPane = getContentPane();
		//content paneにパネルを追加
		contentPane.add(p);
	}


	/*メインメソッド*/
	public static void main(String args[]){
		LayoutManager frame = new LayoutManager("タイトル");
		frame.setVisible(true);
	}




}
