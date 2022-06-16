package by.academy.vetvlenia;

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x; // nomer dnia

		System.out.print("Vvedite nomer dnia");
		sc = new Scanner(System.in);
		System.out.print("> ");
		x = sc.nextInt();

		if ((x <= 1) || (x >= 365)) {
			System.out.print("Net takogo dnai v godu");
		}

		if ((x >= 1) && (x <= 31)) {
			System.out.print("Janvar, den nr" + x);
		}
		if ((x >= 32) && (x <= 59)) {
			x = x - 31;
			System.out.print("Fevral, den nr" + x);
		}
		if ((x >= 60) && (x <= 90)) {
			x = x - 51;
			System.out.print("Mart, den nr" + x);
		}
		if ((x >= 91) && (x <= 120)) {
			x = x - 90;
			System.out.print("Aprel, den nr" + x);
		}
		if ((x >= 121) && (x <= 151)) {
			x = x - 120;
			System.out.print("Maj, den nr" + x);
		}
		if ((x >= 152) && (x <= 181)) {
			x = x - 151;
			System.out.print("Iun, den nr" + x);
		}
		if ((x >= 182) && (x <= 212)) {
			x = x - 181;
			System.out.print("Iul, den nr" + x);
		}
		if ((x >= 213) && (x <= 243)) {
			x = x - 212;
			System.out.print("Avgust, den nr" + x);
		}
		if ((x >= 244) && (x <= 273)) {
			x = x - 51;
			System.out.print("Sentiabr, den nr" + x);
		}
		if ((x >= 274) && (x <= 304)) {
			x = x - 51;
			System.out.print("Oktiabr, den nr" + x);
		}
		if ((x >= 305) && (x <= 334)) {
			x = x - 304;
			System.out.print("Noyabr, den nr" + x);
		}
		if ((x >= 335) && (x <= 365)) {
			x = x - 334;
			System.out.print("Dekabr, den nr" + x);
		}

	}
}
