package by.academy.cikly;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double x;
		double sum;
		double czislo;
		n = 10;
		x = 2;
		sum = 1;
		czislo = 1;
		while (x <= n) {
			sum = sum + x;
			czislo = czislo * sum;
			x = x + 1;
		}
		System.out.print("Summa = " + czislo);
	}

}
