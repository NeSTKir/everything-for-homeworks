package by.academy.cikly;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x;
		double sum;
		double czislo;
		n = 10;
		x = 1;
		sum = 1.0;
		czislo = 1;
		while (x <= n) {
			sum = sum + Math.pow(2, x);
			x = x + 1;
		}
		System.out.print("Summa = " + sum);
	}

}
