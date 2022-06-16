package by.academy.vetvlenia;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		double min;
		double max;
		double czislo;
		a = 4;
		b = 20;
		c = 1;
		min = 0;
		max = 0;
		
		min = Math.min(a,b);
		max = Math.max(a,b);
		czislo = Math.min(min,c) + Math.max(max,c);
		System.out.print("czislo = "+ czislo);
	}

}
