/*
 * フレームにPanelを追加するサンプルプログラム
 *
 *
 */



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;

/*JFrameを継承したクラス*/
class CreatePanel extends JFrame{

	/*コンストラクタ*/
	CreatePanel(String title){
		//タイトルを設定
		setTitle(title);
		//座標と、サイズを設定
		setBounds(100, 100, 300, 250);
		//×で終了を設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネルを新しく生成
		JPanel p1 = new JPanel();
		//背景色を指定
		p1.setBackground(Color.BLUE);

		//パネルを新しく生成
		JPanel p2 = new JPanel();
		//背景色を指定
		p2.setBackground(Color.ORANGE);

		//Content Paneを新しく生成
		Container contentPane = getContentPane();
		//content paneにp1パネルを追加 (場所はNORTH)
		contentPane.add(p1, BorderLayout.NORTH);
		//content paneにp2パネルを追加 (場所はSOUTH)
		contentPane.add(p2, BorderLayout.SOUTH);
	}




	public static void main(String args[]){
		CreatePanel frame = new CreatePanel("タイトル");
		frame.setVisible(true);
	}

}
