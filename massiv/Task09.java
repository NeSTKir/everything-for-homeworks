package by.academy.massiv;

import java.util.Random;
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] mas;
		int max;
		int min;
		max = 0;
		min = 0;
		int chang;
		chang = 0;
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
		min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min <= mas[i]) {
				if (max <= mas[i]) {
					max = mas[i];
				}
			} else {
				min = mas[i];
			}
			System.out.println("min =" + min + " max = " + max);

			chang = min;
			min = max;
			max = chang;
		}
		System.out.println(" min = " + min + " max = " + max);
	}

}
