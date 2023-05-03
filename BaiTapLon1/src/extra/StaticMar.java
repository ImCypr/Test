package extra;

import java.awt.Color;
import java.io.PrintWriter;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class StaticMar {
	public static int n = 8;
	public static int boom = 8;
	public static Color cl = Color.CYAN.brighter();
	public static Color clo = Color.YELLOW.brighter();
	public static Color cli = Color.YELLOW.brighter();
	public static int Time =0;
//	public static int check=80;


	public StaticMar() {
		this.Time = 0;
	}
//	public void setCheck(int n) {
//		this.check = n;
//	}
//	public void setTime() {
////		this.Time=StaticMar.n*5*(StaticMar.boom/2);
//		
//	}
	
//	public void setHardTime(int x) {
//		this.check *= x/4;
//	}
	
//	private int max(int i, int j) {
//		// TODO Auto-generated method stub
//		if(i>j) return i;
//		else return j;
//	}

	public void setN(int x) {
		this.n = x;
		this.boom = x;
//		this.setCheck(x*10);
		System.out.println(n);
	}

	public void setBoom(int x) {
		if (x == 4) {
			this.boom += 0*this.n;
			System.out.println("easy");
			System.out.println("click easy");
			
		}
		if (x == 8) {
			this.boom += 0.5 * this.n;
			System.out.println("click normal");
		}
		if (x == 16) {
			System.out.println("click hard");
			this.boom += 1 * this.n;
		}
//		this.setHardTime(x);
	}
	
	public static Icon imgboom = new ImageIcon(StaticMar.class.getResource("mine-icon.png"));
	public static Icon imghelp = new ImageIcon(StaticMar.class.getResource("Button-Help-icon.png"));
}
