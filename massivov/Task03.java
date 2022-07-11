package by.academy.massiv.massivov;

import java.util.Random;

public class Task03 {

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
		for (int i = 0; i < a; i++) {
			System.out.print("mas[" + i + "][0] = " + mas[i][0] + "; ");
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < a; i++) {
			System.out.print("mas[" + i + "][" + (mas[i].length - 1) + "] = " + mas[i][(mas[i].length - 1)] + "; ");
		}
	}

}
