package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;

import control.UnitControl;
import extra.StaticMar;
import model.MaTrix;
import model.Unit;

public class GameSide extends JPanel {
	private Unit u[][];
	private MaTrix m;
	private UnitControl ctrl[][];
	private int clicked = 0;
	private game gm;

	public GameSide(game gm) {
		super();
		this.setLayout(new GridLayout(StaticMar.n, StaticMar.n));
		this.gm = gm;

		this.m = new MaTrix(StaticMar.n, StaticMar.boom);
		this.u = new Unit[StaticMar.n + 2][StaticMar.n + 2];
		this.ctrl = new UnitControl[StaticMar.n + 2][StaticMar.n + 2];

		for (int i = 1; i <= StaticMar.n; i++) {
			for (int j = 1; j <= StaticMar.n; j++) {
				double x = i + (double) j / 100;
				u[i][j] = new Unit(this.m.getMT(i, j), this.m.getKE(i, j), x, StaticMar.cl);
				ctrl[i][j] = new UnitControl(this, u[i][j]);
				u[i][j].addMouseListener(ctrl[i][j]);
				this.add(u[i][j]);
			}
		}
	}

	public void NewClicked() throws IOException {
		this.clicked++;
		System.out.println(this.clicked);

		if (this.clicked == StaticMar.n * StaticMar.n - StaticMar.boom) {
			System.out.println(clicked + "game win");
			gm.GameWin();
		}

	}

	public void GameLost() {
		gm.GameLost();
	}

	public void GameWin() {
		try {
			gm.GameWin();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void showAll() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= StaticMar.n; i++) {
			for (int j = 1; j <= StaticMar.n; j++) {
				u[i][j].checkBoom();
			}
		}
	}
	public void showRound(int i, int j) {
   	 	if(u[i][j].getCanh() == 0) {
   	 		for(int d=-1; d<=1; d++) {
   	 			for(int e=-1;e<=1;e++) {
   	 				if(i+d==0 || i+d>StaticMar.n) this.u[1][j+e].checkBoom();
   	 				if(j+e==0 || j+e>StaticMar.n) this.u[i+d][1].checkBoom();
   	 				this.u[i+d][j+e].checkBoom();
   	 			}
   	 		}
   	 	}
    }

}
