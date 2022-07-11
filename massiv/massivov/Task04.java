package by.academy.massiv.massivov;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a;
		int b;
		a = 4;
		b = 5;
		n = 9;
		int[][] mas;
		mas = new int[a][b];

		Random rand = new Random();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				mas[i][j] = rand.nextInt(n);
				System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int j = 0; j < b; j++) {
			System.out.print("mas[0][" + j + "] = " + mas[0][j] + "; ");
		}

		System.out.println();
		System.out.println();

		for (int j = 0; j < b; j++) {
			System.out.print("mas[" + (mas.length - 1) + "][" + j + "] = " + mas[(mas.length - 1)][j] + "; ");
		}
	}

}
