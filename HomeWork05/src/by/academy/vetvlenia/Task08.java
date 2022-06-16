package by.academy.vetvlenia;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 2;
		b = 3;
		double min;
		if (Math.pow(a,2) < Math.pow(b,2)) {
			min = Math.pow(a,2);
		} else {
			min = Math.pow(b,2);
		}
		System.out.print("min kvadrat czisla =" + min);
	}

}
