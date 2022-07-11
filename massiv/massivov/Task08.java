package by.academy.massiv.massivov;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a;
		int b;
		int raz;
		raz = 0;
		a = 7;
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
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					raz = raz + 1;
				}

			}
		}
		System.out.print("Takih czisel = " + raz);
	}

}
