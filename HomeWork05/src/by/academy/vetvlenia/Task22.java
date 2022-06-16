package by.academy.vetvlenia;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int max;
		int min;
		x = 210;
		y = 500;
		max = 0;
		min = 0;
		if (x > y) {
			System.out.print("x= "+x+" y= "+y);
		} else if(x < y) {
			min = x;
			max = y;
			x = max;
			y = min;
			System.out.print("x= "+x+" y= "+y);
		} else {
			System.out.print("x = y = 0");
		}
		
	}

}
