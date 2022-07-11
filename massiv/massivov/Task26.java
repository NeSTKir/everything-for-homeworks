package by.academy.massiv.massivov;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 4;
		int m;
		m = 4;
		int temp;
		temp = 0;

		int[][] mas;
		mas = new int[n][m];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("Input the nuber of massive [" + i + "][" + j + "] >");
				mas[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mas[i][j] < 0) {
					temp = temp + mas[i][j];
				}
			}
			System.out.print("Sum of numbers = " + temp);
			System.out.println();
			temp = 0;

		}
		temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mas[i][j] > temp) {
					temp = mas[i][j];
				}
			}
			System.out.print("MAX of numbers = " + temp);
			System.out.println();
			temp = 0;
		}
	}

}
