package by.academy.line;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z;
		double a;
		double b;
		double c;
		a = 2;
		b = 3;
		c = 1;
		z = (b + (Math.pow((Math.pow(b, 2) + 4 * a * c), -2))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.print("z =" + z);
	}

}
