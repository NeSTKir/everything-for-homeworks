package by.academy.cikly;

public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		int x;
		int y;
		int czis;
		int czislo;
		double d;
		double f;
		x = 0;
		y = 0;
		a = 345;
		b = 1768;
		d = a;
		f = b;
		czis = 0;
		czislo = 0;
	
		while (d > 1) {
			x = x + 1;
			d = d / 10;
		}
		while (f > 1) {
			y = y + 1;
			f = f / 10;
		}
		System.out.print("x="+x+" y="+y);
		do {
			czislo = a / Math.pow(10,(x-1));
		}
	}
	
	

}
