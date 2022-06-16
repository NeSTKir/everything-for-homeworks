package by.academy.vetvlenia;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		int h; // vysota piervogo triugolnka
		int hh; // vysota vtorogo triugolnika

		double S;
		double SS;
		double max;
		a = 3;
		b = 5;
		h = 3;
		hh = 1;

		S = (a * h) / 2;
		SS = (b * hh) / 2;
		if (S < SS) {
			max = SS;
		} else {
			max = S;
		}
		System.out.print("max S = " + max);
	}

}
