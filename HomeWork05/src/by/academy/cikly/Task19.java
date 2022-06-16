package by.academy.cikly;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double n;
		double e;
		int x;
		double sum;
		sum = 0;
		a = 0;
		n = 10;
		e = 0.001;
		x = 1;

		while (x <= n) {
			a = 1 / Math.pow(2, x) + 1 / Math.pow(3, x);
			x = x + 1;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}
		System.out.print("Summa = " + sum);
	}

}
