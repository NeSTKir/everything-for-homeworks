package by.academy.cikly;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int x;
		int h;
		int y;
		a = -5;
		b = 50;
		h = 3;
		
		x = a;
		y = 0;
		while (x <= b) {
			if (x <= 2) {
				y = -1 * x;
				System.out.println("y =" + y);
				x = x + h;
			} else {
				y = x;
				System.out.println("y =" + y);
				x = x + h;
			}
		}

	}

}
