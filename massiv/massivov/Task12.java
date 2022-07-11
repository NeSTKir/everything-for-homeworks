package by.academy.massiv.massivov;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int k;
		k = 10;
		n = 8;
		int[][] mas;
		mas = new int[(n - 1)][(n - 1)];

		Random rand = new Random();
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - 1); j++) {
				mas[i][j] = rand.nextInt(k);
				System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
			}
			System.out.println();

		}
	}

}
