package by.academy.vetvlenia;

public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int x;
		int y;
		int z;
		a = 2;
		b = 3;
		x = 1;
		y = 5;
		z = 1;

		if ((a > x) & (b > y)) {
			System.out.println("Proydiot.");
		} else if ((a > y) & (b > x)) {
			System.out.println("Proydiot.");
		} else if ((a > x) & (b > z)) {
			System.out.println("Proydiot.");
		} else if ((a > z) & (b > x)) {
			System.out.println("Proydiot.");
		} else if ((a > y) & (b > z)) {
			System.out.println("Proydiot.");
		} else if ((a > z) & (b > y)) {
			System.out.println("Proydiot.");
		} else {
			System.out.println("NIE Proydiot.");
		}

	}

}
