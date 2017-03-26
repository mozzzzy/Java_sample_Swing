/*
 * 
 *
 */


import javax.swing.*;
import java.awt.event.*;

/*JFrameを継承したクラス. 抽象クラスActionListenerを使う*/
public class ActionEventTest extends JFrame implements ActionListener{

	/*ラベル*/
	JLabel label;

	/*コンストラクタ*/
	ActionEventTest(String title){
		//フレームにタイトルを設定
		setTitle(title);
		//座標とサイズを指定
		setBounds( 10, 10, 300, 200);

		//ラベルを新規生成
		label = new JLabel("");

		//ボタンを新規生成
		JButton btn = new JButton("Push");
		btn.addActionListener(this);

		//パネルを新規生成
		JPanel p = new JPanel();
		//ラベルとボタンをパネルに追加
		p.add(label);
		p.add(btn);

		//content paneを生成して、パネルを追加
		getContentPane().add(p);
	}

	//アクションを定義
	public void actionPerformed(ActionEvent e){
		//"Push"をラベルにセット
		label.setText("Push");
	}


	public static void main(String[] args){
		ActionEventTest test = new ActionEventTest("ActionEventTest");

		//×ボタンでプログラムの終了を指定
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//フレームの表示
		test.setVisible(true);
	}




}

