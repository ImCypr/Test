package model;

import javax.swing.JButton;

public class OptionalButton extends JButton {
	private String ten = "";

//	
	public OptionalButton(String s) {
		super();
		this.ten = s;
		this.setText(s);
	}

	public void setTen() {
		this.ten = this.getText();
	}

	public String getTen() {
		return this.ten;
	}

}
