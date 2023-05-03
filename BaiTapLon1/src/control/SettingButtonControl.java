package control;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import extra.StaticMar;
import model.SettingGame;

public class SettingButtonControl implements MouseListener {
	private SettingGame button;
	private StaticMar st = new StaticMar();

	public SettingButtonControl(SettingGame button) {
		super();
		this.button = button;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (this.button.isLevel() == true)
			st.setN(this.button.getlevel());
		if (this.button.isLevel() == false)
			st.setBoom(this.button.getlevel());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(this.button.getText() == "TG" || this.button.getText() == "Easy") {
			this.button.setBackground(Color.ORANGE);
			this.button.setForeground(Color.WHITE);
		}
		if(this.button.getText() == "8x8" || this.button.getText() == "Normal") {
			this.button.setBackground(Color.red);
			this.button.setForeground(Color.WHITE);
		}
		if(this.button.getText() == "16x16" || this.button.getText() == "Hard") {
			this.button.setBackground(Color.BLUE);
			this.button.setForeground(Color.WHITE);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.button.setBackground(Color.WHITE);
		this.button.setForeground(Color.BLACK);
	}

}
