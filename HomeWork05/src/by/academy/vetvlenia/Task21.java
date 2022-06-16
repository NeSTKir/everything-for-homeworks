
package by.academy.vetvlenia;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x;
		int y;

		System.out.println("Vvedite datu");
		System.out.println("> ");
		sc = new Scanner(System.in);
		x = sc.nextInt();

		System.out.println("Vvedite miesiac");
		System.out.println("> ");
		sc = new Scanner(System.in);
		y = sc.nextInt();

		if ((x >= 1) && (x <= 31)) {
			System.out.println("Data " + x);
		} else {
			System.out.println("Data niekorektnaja");
		}
		if ((y >= 1) && (y <= 12)) {
			System.out.println("Miesiac " + y);
		} else {
			System.out.println("Miesiac niekorektnyj");
		}
	}
}
