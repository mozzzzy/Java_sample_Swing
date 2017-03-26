/*
 * レイアウトマネージャとしてBorderLayout を使うサンプルコード.
 *
 * BorderLayoutでは、5つの領域が用意されている.
 * 場所の指定には、以下の5つが用意されている.
 *	絶対指定		相対指定
 *	BorderLayout.CENTER	BorderLayout.CENTER		中央	
 *	BorderLayout.NORTH	BorderLayout.PAGE_START		上
 *	BorderLayout.SOUTH	BorderLayout.PAGE_END		下
 *	BorderLayout.WEST	BorderLayout.LINE_START		左
 *	BorderLayout.EAST	BorderLayout.LINE_END		右
 *	
 * 絶対表示と相対表示とがあるが、どちらを使っても良い。ただし、混合して使わないこと。
 *
 * フレームやパネルにコンポーネントを追加する際に利用する「add」メソッドの2番目の引数に
 * 上記のいずれかの値を指定する。 	
 *	
 *	
 */


import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest1 extends JFrame{
	/*コンストラクタ*/
	BorderLayoutTest1(){
		//ボタンを5つ生成。引数は、ボタンに表示する文字列
		JButton button1 = new JButton("PAGE_START");
		JButton button2 = new JButton("CENTER");
		JButton button3 = new JButton("PAGE_END");
		JButton button4 = new JButton("LINE_START");
		JButton button5 = new JButton("LINE_END");

		//パネルの生成
		JPanel p = new JPanel();
		//パネルにBorderLayoutを指定
		p.setLayout(new BorderLayout());

		//パネルにボタンを追加。位置を指定
		p.add(button1, BorderLayout.PAGE_START);
		p.add(button2, BorderLayout.CENTER);
		p.add(button3, BorderLayout.PAGE_END);
		p.add(button4, BorderLayout.LINE_START);
		p.add(button5, BorderLayout.LINE_END);

		//content pane を生成して、バネルを追加
		getContentPane().add(p, BorderLayout.CENTER);
	}

	/*メインメソッド*/
	public static void main(String[] args){
		
		BorderLayoutTest1 frame = new BorderLayoutTest1();

		//×ボタンでプログラムの終了を指定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//座標とサイズを指定
		frame.setBounds(10, 10, 300, 200);
		//タイトルを指定
		frame.setTitle("タイトル");
		//フレームを表示
		frame.setVisible(true);
	}



}

