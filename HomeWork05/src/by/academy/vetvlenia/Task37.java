package by.academy.vetvlenia;

public class Task37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double F;
		x = 2;
		F = 0;
		if (x >= 3) {
			F = Math.pow(x, 2) - 3 * x + 9;
			System.out.print("Znaczenie funkcii = " + F);
		} else {
			F = 1 / (Math.pow(x, 3) + 6);
			System.out.print("Znaczenie funkcii = " + F);
		}
	}

}
