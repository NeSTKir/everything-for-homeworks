package by.academy.vetvlenia;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int czislo;
		czislo = 0;
		a = 44;
		b = 20;
		c = 18;
		d = 15;
		
		czislo = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.print("czislo = "+czislo);
	}

}
