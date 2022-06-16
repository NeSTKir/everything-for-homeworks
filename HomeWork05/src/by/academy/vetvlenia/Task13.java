package by.academy.vetvlenia;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // koordinaty 1 toczki
		int b;
		int c; // koordinaty 2 toczki
		int d;
		a = -1;
		b = 5;
		c = -10;
		d = 1;
		double sum;
		double summ;
		sum = Math.abs(a) + Math.abs(b);
		summ = Math.abs(c) + Math.abs(d);
		if (sum < summ) {
			System.out.print("toczka 1 blize");
		} else {
			System.out.print("toczka 2 blize");
		}

	}

}
