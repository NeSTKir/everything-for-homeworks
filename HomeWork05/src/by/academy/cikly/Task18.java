package by.academy.cikly;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double n;
		double e;
		int x;
		double sum;
		sum = 0;
		a = 0;
		n = 50;
		e = 0.01;
		x = 1;

		while (x <= n) {
			a = Math.pow(-1, (x - 1)) / x;
			x = x + 1;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}
		System.out.print("Summa = " + sum);

	}

}
