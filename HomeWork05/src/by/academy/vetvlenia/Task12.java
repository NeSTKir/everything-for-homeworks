package by.academy.vetvlenia;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double czislo_1;
		double czislo_2;
		double czislo_3;
		a = -100;
		b = 1;
		c = 6;
		if (a >= 0) {
			czislo_1 = Math.pow(a, 2);
		} else {
			czislo_1 = Math.pow(a, 4);
		}
		if (b >= 0) {
			czislo_2 = Math.pow(b, 2);
		} else {
			czislo_2 = Math.pow(b, 4);
		}
		if (c >= 0) {
			czislo_3 = Math.pow(c, 2);
		} else {
			czislo_3 = Math.pow(c, 4);
		}
		System.out.println("czislo_1 = " + czislo_1);
		System.out.println("czislo_2 = " + czislo_2);
		System.out.println("czislo_3 = " + czislo_3);
	}

}
