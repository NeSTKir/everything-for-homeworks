package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int pol;
		int otr;
		int zero;
		pol = 0;
		otr = 0;
		zero = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite koliczestvo > ");
		n = sc.nextInt();
		mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(n);
			System.out.print("mas[" + i + "] = " + mas[i] + "; ");
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				zero = zero + 1;
			}
			if (mas[i] < 0) {
				otr = otr + 1;
			}
			if (mas[i] > 0) {
				pol = pol + 1;
			}
		}
		System.out.println();
		System.out.print("Polozitelnych = " + pol + " Otricatelnych = " + otr + " Nuley = " + zero);
	}

}
