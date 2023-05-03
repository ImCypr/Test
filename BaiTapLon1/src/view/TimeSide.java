package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JPanel;

import extra.StaticMar;

public class TimeSide extends JPanel implements Runnable{
	private JLabel clock, matrix, boom;
	private JLabel time, level, bom;
	private int second;
	private boolean pause;
	private Timer timer;
	private TimerTask task;
//	private int count;
	private game gm;
//	Thread t1;

	public TimeSide(game gm) {
		super();
		Font F1 = new Font("Arial", Font.BOLD, 30);
		this.setFont(F1);
//		t1 = new Thread(this);
		second = 0;
//		t1.start();

		clock = new JLabel();
		clock.setText("Time: ");
		clock.setFont(F1);
		clock.setBackground(StaticMar.cli);
		clock.setForeground(Color.RED.darker());

		matrix = new JLabel();
		matrix.setText("Level: ");
		matrix.setBackground(StaticMar.cli);

		boom = new JLabel();
		boom.setText("Boom: ");
		boom.setBackground(StaticMar.cli);

		time = new JLabel();
		timer = new Timer();
		time.setBackground(StaticMar.cli);
		StaticMar.Time=StaticMar.n*5*(StaticMar.boom/2);
//		cl = new Clock(time);
		
		task = new TimerTask() {
			

			public void run() {
//				count = 0;
				StaticMar.Time++;
				
//	            System.out.println("Count is: " + count);
				time.setText(StaticMar.Time + "");
				time.setFont(F1);
				time.setForeground(Color.RED.brighter());
				if(StaticMar.Time == 0) gm.GameLost();
			}	

		};
		int delay = 1000; // 1 giây
		int period = 1000; // 1 giây
//		timer.schedule(task, 0,1000l);
		timer.scheduleAtFixedRate(task, delay, period);

//		time.setText(second+"");
		

		level = new JLabel();
		level.setText(StaticMar.n + "x" + StaticMar.n);

		bom = new JLabel();
		bom.setText(StaticMar.boom + "");
		this.setLayout(new GridLayout(3, 2));
		this.add(clock);
		this.add(time);
		this.add(matrix);
		this.add(level);
		this.add(boom);
		this.add(bom);
	}
	public void canceledTask() {
		this.task.cancel();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (pause == false) {
				time.setText(second + "");

//				t1.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
