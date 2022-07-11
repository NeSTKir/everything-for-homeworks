package by.academy.massiv.massivov;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 9;
		int[][] mas;
		mas = new int[2][3];

		Random rand = new Random();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				mas[i][j] = rand.nextInt(n);
				System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
			}
			System.out.println();
		}
	}

}
