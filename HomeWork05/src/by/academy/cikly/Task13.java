package by.academy.cikly;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double a;
		double b;
		double h;
		x = 0;
		a = -5;
		b = 5;
		h = 0.5;
		x = a;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		while (x <=5) {
			y = 0;
			y = 5 - (x * x)/2;
			x = x + 0.5;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);

			
		}
		System.out.println("---------------------------------");
	} 

}
