package by.academy.cikly;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int sum;
		sum = 0;
		x = 1;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.print("Vvedite czislo");
		System.out.print("> ");
		y = sc.nextInt();
		while (x <= y) {
			sum = sum + x;
			x = x + 1;
		}
		System.out.print("Summa = " + sum);

	}

}
