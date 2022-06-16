package by.academy.line;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int x;
		int p;
		x = 1234;
		a = x / 1000;
		b = (x - a * 1000) / 100;
		c = (x - a * 1000 - b * 100) / 10;
		d = x - a * 1000 - b * 100 - c * 10;
		p = a * b * c * d;
		System.out.print("p = " + p);

	}

}
