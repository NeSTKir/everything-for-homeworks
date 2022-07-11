package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int[] masss;
		int j;
		j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Skolko elementov budet w massive > ");
		n = sc.nextInt();
		mas = new int[n];
		masss = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(n);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "] = " + mas[i] + "; ");
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (((mas[i] % 2) == 0) && (mas[i] != 0)) {
				masss[j] = mas[i];
				j++;
			}

		}

		for (j = 0; j < mas.length; j++) {
			System.out.println("masss[" + j + "] = " + masss[j] + "; ");
		}
	}

}
