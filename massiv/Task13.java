package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int m;
		int l;
		int g; // vmesto L bolszogo
		int kol;
		kol = 0;
		l = 2;
		g = 9;
		m = 3;

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

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m == 0) {
				if ((mas[i] > l) && (mas[i] <= g))
					kol = kol + 1;
			}
		}
		System.out.println("Koliczestvo elementov = " + kol);
	}

}
