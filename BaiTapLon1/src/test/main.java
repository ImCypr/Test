package test;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.game;

public class main {
	public static void main(String[] args) {

		try{
			new game();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

//	@Override 
//	public void run() {
//		// TODO Auto-generated method stub
//		1
//	}
}
