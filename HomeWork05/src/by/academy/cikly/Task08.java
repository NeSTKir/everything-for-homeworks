package by.academy.cikly;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int x;
		int h;
		double y;
		a = 0;
		b = 50;
		c = 4;
		h = 2;
		x = a;
		y = 0;
		while (x <= b) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y =" + y);
				x = x + h;
			} else {
				y = (x - c) + 6;
				System.out.println("y =" + y);
				x = x + h;
			}
		}
	}

}
