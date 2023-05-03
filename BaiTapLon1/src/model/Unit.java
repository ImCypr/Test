package model;

import java.awt.Color;

import javax.swing.JButton;

import extra.StaticMar;


public class Unit extends JButton {
	private int canh;
	private boolean boom;
	private boolean clicked = false;
	private double location;
	private int check = 0;
//	private boolean truesu = false;

	public Unit(int i, int j, double a, Color cl) {
		super();
		if (i == 1)
			this.boom = true;
		else
			this.boom = false;
		this.canh = j;
		this.location = a;
		this.setBackground(cl);
	}

	public void ButtonClicked() {
		this.clicked = true;
	}
//	public void getTr() {
//		this.truesu = true;
//	}
	public boolean getBoom() {
		return boom;
	}

	public int getCanh() {
		return canh;
	}

	public double getXY() {
		return this.location;
	}

	public void changeColor() {
		this.setBackground(Color.RED);
	}

	public boolean getClicked() {
		return this.clicked;
	}

	public void checkBoom() {
		if (this.getClicked() == false) {
			if (this.getBoom() != true) {
				this.setBackground(Color.WHITE);
				if (this.getCanh() != 0)
					this.setText(this.getCanh() + "");
			} else if (this.getBoom() == true) {
//				this.setIcon(staticNum.imgboom);
				this.setBackground(Color.RED);
				this.setIcon(StaticMar.imgboom);
			}
		}
	}
//	public void showRound(int i, int j) {
//		if(u[i][j].get)
//	}
}
