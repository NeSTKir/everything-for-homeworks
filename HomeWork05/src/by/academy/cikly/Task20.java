package by.academy.cikly;

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double n;
		double e;
		double x;
		double sum;
		sum = 0;
		a = 0;
		n = 20;
		e = 0.000000001;
		x = 1;

		while (x <= n) {
			a = 1 / ((3 * x - 2) * (3 * x + 1));
			x = x + 1;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}
		System.out.print("Summa = " + sum);
	}

}
