/*
 * configIcon.java
 *	iconを設定してみる (mac yosemiteではうまくいかず)
 *		http://www.javadrive.jp/tutorial/jframe/index7.html
 */

import javax.swing.JFrame;
import javax.swing.ImageIcon;

class configIcon extends JFrame{

	/*コンストラクタ*/
	configIcon(String title){
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Iconの設定
		ImageIcon icon = new ImageIcon("./icon.png");
		setIconImage(icon.getImage());
	}

	/*mainメソッド*/
	public static void main(String args[]){
		configIcon frame = new configIcon("タイトル");
		frame.setVisible(true);
	}


}
