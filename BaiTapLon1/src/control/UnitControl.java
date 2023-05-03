package control;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import extra.StaticMar;

import model.Unit;
import view.GameSide;

public class UnitControl implements MouseListener {
	private GameSide gm;
	private Unit u;

	public UnitControl(GameSide gm, Unit u) {
		super();
		this.gm = gm;
		this.u = u;
	}

	public void clicker() {
		if (this.u.getClicked() == false) {
			try {
				this.gm.NewClicked();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("new clicked");
//			u.ButtonClicked();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (this.u.getClicked() == false) {
			this.u.checkBoom();
			if(this.u.getBoom() == false) this.u.setIcon(null);
			
			
//			int x = (int) u.getXY();
//			int y = (int)((u.getXY() - (double)x)*101);
//			System.out.println(x +" "+ y);
////			if(x>1 && x<StaticMar.n && y>1 && y<StaticMar.n) {
//				System.out.println("shownon");
//				gm.showRound(x, y);
////			}
			
			
			
			
			
			if (u.getBoom() == true)
				gm.GameLost();
			clicker();
			u.ButtonClicked();
		}
		
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		if(this.u.getClicked()==true) u.setIcon(null);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(this.u.getClicked() == false) this.u.setIcon(StaticMar.imghelp);
//		this.u.setBackground(Color.WHITE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.u.setIcon(null);

	}

}
