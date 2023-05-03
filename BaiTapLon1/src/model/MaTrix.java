package model;

import java.util.Random;

public class MaTrix {
	private int[][] MT;
	private int[][] Ke;


	public MaTrix(int n, int boom) {
		MT = new int[n + 2][n + 2];
		Ke = new int[n + 2][n + 2];
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				MT[i][j] = 0;
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				Ke[i][j] = -1;
			}
		}
		Random random = new Random();

		int x = boom;

		while (x > 0) {
			int a = random.nextInt(n);
			int b = random.nextInt(n);
			if (MT[a + 1][b + 1] != 1) {
				MT[a + 1][b + 1] = 1;
				
				x--;
			}
		}

		int count;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				count = 0;
				for (int d = -1; d <= 1; d++) {
					for (int e = -1; e <= 1; e++) {

						if (this.MT[i + d][j + e] == 1) {
//							if(d==0 && e==0)
							count++;
						}
					}
				}
				this.Ke[i][j] = count;
			}
		}

	}

	public int getMT(int i, int j) {
		return this.MT[i][j];
	}

	public int getKE(int i, int j) {
		return this.Ke[i][j];
	}

	public void show(int n) {
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				System.out.print(this.MT[i][j] + " " + this.Ke[i][j] + "  ");
			}
			System.out.println(i + " ");
		}
	}

}
