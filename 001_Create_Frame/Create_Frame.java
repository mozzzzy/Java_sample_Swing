/*
 * Swing でGUIの一番外側のフレームを作るサンプルコード
 *	[参考]
 *	・http://www.javadrive.jp/tutorial/jframe/index1.html : (フレームの作成と表示)
 *
 */


import javax.swing.JFrame;

class Create_Frame{
	public static void main(String args[]){
		//JFrameのオブジェクトを生成 (引数は、フレームの上部に表示される)
		JFrame frame = new JFrame("Frame 01");

		/*(1) フレームを表示する座標を指定する場合 */
		//フレームの座標、サイズを指定 (x座標,y座標,width,height)
		//frame.setBounds(100, 100, 200, 250);

		/*
			^
			| ((どっちか))
			v
		*/

		/*(2) フレームを画面中央に表示させる場合 */
		//フレームのサイズを指定
		frame.setSize(400, 300);
		//これがセンタリング
		frame.setLocationRelativeTo(null);



		//フレームの右上にある「×」ボタンをクリックするとフレームが閉じるよう指定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//他の指定は、http://www.javadrive.jp/tutorial/jframe/index4.html を参考

		//フレームの表示
		frame.setVisible(true);
	}
}
