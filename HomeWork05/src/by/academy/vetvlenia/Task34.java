package by.academy.vetvlenia;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double x; // cena knigi
		double y; // summa klienta

		System.out.print("Vvedite stoimost knigi");
		sc = new Scanner(System.in);
		System.out.print("> ");
		x = sc.nextDouble();
		System.out.print("Vvedite summu klienta");
		sc = new Scanner(System.in);
		System.out.print("> ");
		y = sc.nextDouble();
		if (x == y) {
			System.out.print("Spasubo za pokupku !!!");
		} else if (x < y) {
			x = y - x;
			System.out.print("Vasz sdacza = " + x);
		} else {
			y = x - y;
			System.out.print("U vas nie hvataet na pokupku =" + y);
		}
	}

}
