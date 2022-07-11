package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int k;
		k = 5;
		int sum;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skolko elementov budet w massive > ");
		n = sc.nextInt();
		mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(n);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "] = " + mas[i] + "; ");
		}
		
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != 0) {
				if ((mas[i] % k) == 0) {
					sum = sum + mas[i];
					System.out.println("mas[" + i + "] = " + mas[i] + "; ");
				}
			}
		}
		System.out.println("Summa = " + sum);
	}
}
