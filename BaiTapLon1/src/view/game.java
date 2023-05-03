package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import extra.StaticMar;

public class game extends JFrame{
	private GameSide game;
	private OptionSide option;
	private JPanel box;
	private JPanel emptySide;
	private FileWriter fw;
	private StaticMar st = new StaticMar();
//	private boolean isEndGame;

	public game()  {
		game = new GameSide(this);
//		try {
//			fw = new FileWriter("D:\\java-2022-12\\BaiTapLon1\\src\\SaveFile\\save.txt");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		option = new OptionSide(this);
		box = new JPanel();

		emptySide = new JPanel();

		this.setLayout(new BorderLayout());

		this.init();
	}

	private void init() {
		// TODO Auto-generated method stub
//		System.out.println(StaticMar.n * StaticMar.n - StaticMar.boom);
//		System.out.println(StaticMar.Time);
////		this.isEndGame =false;
//		System.out.println(StaticMar.Time);
		box.setLayout(new BorderLayout());
		box.add(emptySide, BorderLayout.WEST);
		box.add(option, BorderLayout.CENTER);
		this.add(game, BorderLayout.CENTER);

		this.add(option, BorderLayout.EAST);

		this.setTitle("Minesweeper");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 50);
		this.setSize(1000, 800);

		this.setVisible(true);
	}

	public void newGame() {
		this.remove(game);
		this.remove(box);
		box = new JPanel();
		this.game = new GameSide(this);
		this.option = new OptionSide(this);
		option.cancelledTask();
		
		
		

		box.add(emptySide, BorderLayout.WEST);
		box.add(option, BorderLayout.CENTER);
		this.add(BorderLayout.CENTER, game);
		this.add(BorderLayout.EAST, box);
		this.init();
	}

	public void showKey() {
		this.game.showAll();
	}
	public void showRecord() {
		try {
			FileReader fr = new FileReader("D:\\java-2022-12\\BaiTapLon1\\src\\test\\save.txt");
			BufferedReader br = new BufferedReader(fr);
			JFrame f= new JFrame();
			f.setSize(400,300);
			f.setLocationRelativeTo(null);
			JLabel jp = new JLabel();
			f.add(jp);
			Scanner sc = new Scanner(br);
			String td;
			String out = "";

			while(sc.hasNextLine()) {
				out += sc.nextLine()+ "           "+"\r\n";
//					br.readLine();
			}
			System.out.println(out);
			jp.setText(out);
			sc.close();
			f.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
//	public void TimeLost() {
//		if(StaticMar.Time == 0) 
//	}
	public void GameLost() {
//		
//		if()
		int a = JOptionPane.showConfirmDialog(this, "Thua. Ban co muon choi lai khong?");
		if (a == JOptionPane.YES_OPTION)
			this.newGame();
	}

	public void GameWin(){
		String s = JOptionPane.showInputDialog("Ban da thang, ban co muon luu ten hay khong?");
		
			FileWriter pw = null;
			try {
				try {
					pw = new FileWriter("D:\\java-2022-12\\BaiTapLon1\\src\\test\\save.txt",true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedWriter bw = new BufferedWriter(pw);
				try {
					bw.write(s+" "+StaticMar.n+" "+ StaticMar.boom+" "+StaticMar.Time);
					bw.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					bw.close();
					pw.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
