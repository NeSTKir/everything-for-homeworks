package by.academy.line;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		x = 1;
		y = 0.5;
		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.print("z =" + z);
	}

}
