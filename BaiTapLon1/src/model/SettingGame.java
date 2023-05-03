package model;

import javax.swing.JButton;

public class SettingGame extends JButton {
	private int level;
	private boolean isLevel;

	public SettingGame(int level, boolean isLevel) {
		super();
		this.level = level;
		this.isLevel = isLevel;
	}

	public boolean isLevel() {
		return this.isLevel;
	}

	public int getlevel() {
		return this.level;
	}

}
