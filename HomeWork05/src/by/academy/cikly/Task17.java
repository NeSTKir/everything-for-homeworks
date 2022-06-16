package by.academy.cikly;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double a;
		int x;
		double sum;
		double czislo;
		n = 10;
		a = 3;
		x = 1;
		sum = 1;
		czislo = a * (a + 1);
		while (x <= n) {
			sum = a + 1 / x;
			czislo = czislo * sum;
			x = x + 1;
		}
		System.out.print("Summa = " + czislo);
	}

}
