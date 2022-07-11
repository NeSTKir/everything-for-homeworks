package by.academy.massiv.massivov;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a;
		int b;
		int k;
		int p;
		k = 2;
		p = 4;
		a = 5;
		b = 5;
		n = 10;
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

		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[k][i] + " ");

		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i][p] + " ");
		}
	}

}
