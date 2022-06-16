package by.academy.vetvlenia;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		x = 0;
		y = -2;
		if ((x == 0) && (y == 0)) {
			System.out.print("toczka zero");
		} else if (x == 0) {
			System.out.print("toczka no osi x");
		} else if (y == 0) {
			System.out.print("toczka na osi y");
		} else if ((x < 0) && (y < 0)) {
			System.out.print("toczka v nizniem levom uglu");
		} else if ((x > 0) && (y < 0)) {
			System.out.print("toczka v nizniem pravom uglu");
		} else if ((x < 0) && (y > 0)) {
			System.out.print("toczka v verchnem levom uglu");
		} else if ((x > 0) && (y > 0)) {
			System.out.print("toczka v verchnem pravom uglu");
		}

	}
}
