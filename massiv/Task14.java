package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int[] masnew;

		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite koliczestvo > ");

		n = sc.nextInt();
		mas = new int[n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(n);
			System.out.print("mas[" + i + "] = " + mas[i] + "; ");
		}
		System.out.println();

		masnew = new int[n];

		for (int i = 0; i < masnew.length - 1; i++) {
			int a;
			int b;
			a = i * 2;
			b = i * 2 + 1;
			masnew[i] = mas[a] + mas[b];
		}
	}

}
