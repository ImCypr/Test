package view;

import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

//import javax.swing.SettingGame;

import control.SettingButtonControl;
import model.SettingGame;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LevelSide extends JPanel {
	private SettingGame game4;
	private SettingGame game8;
	private SettingGame game16;
	private SettingButtonControl sctrl[];

	private SettingGame easy, normal, hard;

	private JLabel Level, Hard;

	public LevelSide() {
		super();
		sctrl = new SettingButtonControl[6];
		Level = new JLabel("Marix level: ");
		
		game4 = new SettingGame(4, true);
		game4.setText("TG");
		game4.setBackground(Color.WHITE);
		sctrl[0] = new SettingButtonControl(game4);
		game4.addMouseListener(sctrl[0]);

		game8 = new SettingGame(8, true);
		game8.setText("8x8");
		game8.setBackground(Color.WHITE);
		sctrl[1] = new SettingButtonControl(game8);
		game8.addMouseListener(sctrl[1]);

		game16 = new SettingGame(16, true);
		game16.setText("16x16");
		sctrl[2] = new SettingButtonControl(game16);
		game16.setBackground(Color.WHITE);
		game16.addMouseListener(sctrl[2]);

		Hard = new JLabel("Hard level: ");
		easy = new SettingGame(4, false);
		easy.setBackground(Color.WHITE);
		easy.setText("Easy");
		sctrl[3] = new SettingButtonControl(easy);
		easy.addMouseListener(sctrl[3]);

		normal = new SettingGame(8, false);
		normal.setText("Normal");
		normal.setBackground(Color.WHITE);
		sctrl[4] = new SettingButtonControl(normal);
		normal.addMouseListener(sctrl[4]);

		hard = new SettingGame(16, false);
		hard.setText("Hard");
		hard.setBackground(Color.WHITE);
		sctrl[5] = new SettingButtonControl(hard);
		hard.addMouseListener(sctrl[5]);

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.4;
		c.anchor = GridBagConstraints.WEST;
		this.add(Level, c);

		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 0.4;
		this.add(Hard, c);

		c.fill = GridBagConstraints.BOTH;
		c.gridy = 0;
		c.weighty = 0.2;
		c.gridx = 1;
		this.add(game4, c);
		c.gridx = 2;
		this.add(game8, c);
		c.gridx = 3;
		this.add(game16, c);

		c.gridy = 1;
		c.gridx = 1;
		this.add(easy, c);
		c.gridx = 2;
		this.add(normal, c);
		c.gridx = 3;
		this.add(hard, c);

	}

}
