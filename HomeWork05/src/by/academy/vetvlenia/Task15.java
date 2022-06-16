package by.academy.vetvlenia;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double a;
		double b;
		x = 2;
		y = 5.4;

		a = (x + y) / 2;
		b = 2 * x * y;
		if (x < y) {
			x = a;
			y = b;
		} else {
			x = b;
			y = a;
		}
		System.out.println("x =" + x);
		System.out.print("y =" + y);

	}

}
