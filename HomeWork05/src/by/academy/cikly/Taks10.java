package by.academy.cikly;

public class Taks10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double sum;
		sum = 1;
		a = 1;

		while (a <= 200) {
			sum = sum * (a * a);
			a = a + 1;
		}
		System.out.print("Summa = " + sum);
	}

}
