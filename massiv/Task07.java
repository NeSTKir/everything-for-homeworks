package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int z;
		int zam;
		int sum;
		sum = 0;
		z = 7;
		zam = 0;

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
			if (mas[i] >= z) {
				mas[i] = z;
				sum = sum + 1;
			}
		}
		System.out.println();
		System.out.print("Summa takich czisel = " + sum);

	}

}
