package by.academy.massiv.massivov;

import java.util.Scanner;
import java.util.Random;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		int a;
		int temp;
		int x;
		int y;
		a = 5;
		b = 5;
		temp = 0;
		int[][] mas;
		mas = new int[a][b];

		Random rand = new Random();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				mas[i][j] = rand.nextInt(15);
				System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the nuber of column nr1 >");
		x = sc.nextInt();
		System.out.println();

		System.out.println("Input the nuber of column nr2 >");
		y = sc.nextInt();
		System.out.println();

		for (int i = 0; i < a; i++) {
			temp = mas[i][x];
			mas[i][x] = mas[i][y];
			mas[i][y] = temp;
			System.out.print("mas[" + i + "][" + x + "] = " + mas[i][x] + "; ");
			System.out.print("mas[" + i + "][" + y + "] = " + mas[i][y] + "; ");

			System.out.println();
		}
	}

}
