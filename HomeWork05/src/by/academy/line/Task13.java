package by.academy.line;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double x2;
		double y2;
		double x3;
		double y3;
		double P;
		double p;
		double S;
		double a;
		double b;
		double c;
		x = 1;
		y = 2;
		x2 = 2;
		y2 = 2;
		x3 = 3;
		y3 = 3;
		a = Math.pow((Math.pow((x2 - x), 2) + (Math.pow((y2 - y), 2))), -2);
		b = Math.pow((Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2))), -2);
		c = Math.pow((Math.pow((x - x3), 2) + (Math.pow((y - y3), 2))), -2);
		P = a + b + c;
		p = P / 2;
		S = Math.pow((p * (p - a) * (p - b) * (p - c)), -2);
		System.out.print("P =" + P + " S =" + S);
	}

}
