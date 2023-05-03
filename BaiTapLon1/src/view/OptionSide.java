package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

import extra.StaticMar;

public class OptionSide extends JPanel {
	private TimeSide time;
	private ControlSide control;
	private LevelSide level;
	private game gm;
	private JPanel empty1,empty2,empty3,empty4;

	public OptionSide(game gm) {
		super();
		this.gm = gm;
		this.setBackground(Color.black);
		time = new TimeSide(gm);
		control = new ControlSide(gm);
		level = new LevelSide();

		this.setLayout(new GridLayout(6,1));

		empty1 = new JPanel();
		empty1.setBackground(StaticMar.clo);
		empty2 = new JPanel();
		empty2.setBackground(StaticMar.clo);
		empty3= new JPanel();
		empty3.setBackground(StaticMar.clo);
		empty4 = new JPanel();
		empty4.setBackground(StaticMar.clo);
		this.add(empty1);
		this.add(level);
		this.add(empty2);

		this.add(time);

		this.add(control);
		this.add(empty4);
	}
	public void cancelledTask() {
		this.time.canceledTask();
	}

}
