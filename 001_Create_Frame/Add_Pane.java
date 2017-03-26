/*
 * フレームにcontentPaneを用意して、contentPaneにボタンを一つ追加
 *	contentPane ... http://www.javadrive.jp/tutorial/jframe/index6.html の図を参照.
 *
 */


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

/*JFrameの子クラスとして定義*/
class Add_Pane extends JFrame{

	/*コンストラクタ*/
	Add_Pane(String title){
		//タイトルを設定
		setTitle(title);
		//座標とサイズを指定
		setBounds(100, 100, 300, 250);
		//×ボタンでプログラム終了を指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//ボタンを生成
		JButton btn = new JButton("ボタン");

		//contentPaneを生成
		Container contentPane = getContentPane();
		//contentPaneにボタンを追加
		contentPane.add(btn, BorderLayout.NORTH);
	}


	/*メインメソッド*/
	public static void main(String args[]){
		Add_Pane frame = new Add_Pane("Add_Pane");
		frame.setVisible(true);
	}



}
