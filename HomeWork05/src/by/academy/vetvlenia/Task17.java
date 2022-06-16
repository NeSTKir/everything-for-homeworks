package by.academy.vetvlenia;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 3;
		b = 25;
		int max;
		if (a == b) {
			a = 0;
			b = 0;
		} else if (a > b) {
			max = a;
			b = max;
		} else {
			max = b;
			a = max;
		}
		System.out.println("a =" + a + " b =" + b);

	}
}
