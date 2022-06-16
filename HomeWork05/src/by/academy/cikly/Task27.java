package by.academy.cikly;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int n;
		int x;
		int y;
		String sum;
		sum = " ";
		y = 2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vvedite czislo m");
		System.out.print("> ");
		m = sc.nextInt();
		System.out.print("Vvedite czislo n");
		System.out.print("> ");
		n = sc.nextInt();
		x = m;
		while (x <= n) {
			System.out.print("Dla czisla " + x + " : ");
			while ((y > 1) && (y < m)) {
				if (x % y == 0) {
					System.out.print(" "+y+" ");
					y = y + 1;
				}
			}
			x = x + 1;
		}
	}

}
