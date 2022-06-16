package by.academy.vetvlenia;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // radius piervogo kruga
		int b; // radius vtorogo kruga
		double S;
		double SS;
		double min;
		a = 3;
		b = 5;
		S = Math.PI * (a * a);
		SS = Math.PI * (b * b);
		if (S < SS) {
			min = S;
		} else {
			min = SS;
		}
		System.out.print("min S = " + min);
	}

}
