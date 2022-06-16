package by.academy.line;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		double P;
		double S;
		x = 1;
		y = 3;
		S = (1 / 2) * x * y + Math.sin(90);
		z = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), -2);
		P = x + y + z;
		System.out.print("P =" + P + " S=" + S);
	}

}
