/*
 * Create_Frame.java の書き換え 
 * 	フレームを生成するだけならCreate_Frame.javaの書き方でも良いが、
 * 	実際には、フレームの中にいろんなコンポーネントを追加する。
 * 	このため、これらをまとめてクラスにしておけば、mainはこれをインスタンス化するだけで綺麗。
 * 
 */

import javax.swing.JFrame;

/*JFrameの子クラスを定義*/
class Rewriting_01 extends JFrame{

	/*コンストラクタ*/
	Rewriting_01(String title){
		setTitle(title);
		setBounds(100, 100, 200, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*main メソッド*/
	public static void main(String args[]){
		Rewriting_01 frame = new Rewriting_01("Rewriting_01");
		frame.setVisible(true);
	}




}
