package control;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import extra.StaticMar;
import model.OptionalButton;
import view.game;

public class OptionButtonControl implements MouseListener {
	private OptionalButton button;
	private game gm;
	private String ten = "";

	public OptionButtonControl(OptionalButton button, game gm) {
		super();
		this.button = button;
		this.gm = gm;
		this.ten = button.getTen();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		String str = e.getButton();
		System.out.println(this.ten);
		if (ten == "New")
			gm.newGame();
		if (ten == "Key")
			gm.showKey();
		if(ten == "Record") {
			gm.showRecord();
		}
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
		this.button.setForeground(Color.YELLOW.brighter());
		this.button.setBackground(Color.BLUE.brighter());
		this.button.setFont(new Font("Arial", Font.BOLD, 25));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.button.setBackground(Color.WHITE);
		this.button.setForeground(null);
		this.button.setFont(new Font("Arial", Font.ITALIC, 25));

	}

}
