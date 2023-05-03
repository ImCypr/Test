package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

//import javax.swing.OptionalButton;

import control.OptionButtonControl;

import javax.swing.JPanel;

import model.OptionalButton;

public class ControlSide extends JPanel {
	private game gm;
	private OptionalButton newGame;
	private OptionalButton showAll;
	private OptionalButton Save;
	private OptionalButton Record;

	private OptionButtonControl ng, sv, ky, rc;

	public ControlSide(game gm) {
		super();
		this.gm = gm;
		Font font = new Font("Arial", Font.ITALIC, 25);

		this.newGame = new OptionalButton("New");
		newGame.setText("New");
		newGame.setFont(font);
		newGame.setBackground(Color.WHITE);
		ng = new OptionButtonControl(newGame, gm);
		newGame.addMouseListener(ng);
		this.showAll = new OptionalButton("Key");
		showAll.setFont(font);
		showAll.setBackground(Color.WHITE);
		ky = new OptionButtonControl(showAll, gm);
		showAll.addMouseListener(ky);
//		this.Save = new OptionalButton("Save");
//		Save.setFont(font);
//		sv = new OptionButtonControl(Save, gm);
//		Save.addMouseListener(sv);
		this.Record = new OptionalButton("Record");
		Record.setFont(font);
		rc = new OptionButtonControl(Record, gm);
		Record.addMouseListener(rc);
		Record.setBackground(Color.WHITE);


		this.setLayout(new GridLayout(3, 1));
		this.add(newGame);
		this.add(showAll);
//		this.add(Save);
		this.add(Record);
	}

}
