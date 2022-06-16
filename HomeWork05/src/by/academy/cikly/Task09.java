package by.academy.cikly;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double sum;
		sum = 0;
		a = 0;

		while (a <= 100) {
			sum = sum + Math.pow(a, 2);
			a = a + 1;
		}
		System.out.print("Summa = " + sum);

	}

}
