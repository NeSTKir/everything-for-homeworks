package by.academy.vetvlenia;

public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		a = 44;
		b = 20;
		c = 18;
		if ((a > b) && (b > c)) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.print("a = "+a+" b = "+b+" c = "+c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.print("a = "+a+" b = "+b+" c = "+c);
		}
	}

}
