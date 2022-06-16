package by.academy.cikly;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double x;
		double sum;
		n = 10;
		x = 1;
		sum = 0;
		while (x <= n) {
			sum = sum + 1 / x;
			x = x + 1;
		}
		System.out.print("Summa = " + sum);
	}

}
