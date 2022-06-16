package by.academy.vetvlenia;

public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		x1 = 1;
		y1 = 3;
		x2 = 1;
		y2 = 2;
		x3 = 1;
		y3 = 5;

		if (((x1 == x2) && (x2 == x3)) || ((y1 == y2) && (y2 == y3))) {
			System.out.print("toczki lezat na odnoy priamoy");
		} else {
			System.out.print("toczki nie lezat na odnoy priamoy");
		}
	}

}
