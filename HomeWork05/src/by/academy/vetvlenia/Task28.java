package by.academy.vetvlenia;

public class Task28 {

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
		d = 100;
		if ((a != d) && (b != d) && (c != d)) {
			czislo = Math.max(Math.max((d - a), (d - b)), (d - c));
			System.out.print("czislo = " + czislo);
		}
	}

}
