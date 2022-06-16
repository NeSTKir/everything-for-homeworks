package by.academy.cikly;

public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double a;
		double b;
		double h;
		x = 0;
		a = -3;
		b = 5;
		h = 1.0;
		x = a;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		while (x <= b) {
			y = 0;
			y = Math.cos(x / 3) / Math.sin(x / 3) + 1 / 2 * Math.sin(x);
			x = x + 0.5;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);

		}
		System.out.println("---------------------------------");
	}

}
