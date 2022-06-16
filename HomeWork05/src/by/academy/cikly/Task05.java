package by.academy.cikly;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int sum;
		sum = 0;
		x = 1;
		while (x <= 99) {
			if (x % 2 == 0) {
				x = x + 1;
			} else {
				sum = sum + x;
				x = x + 1;
			}

		}
		System.out.print("Summa = " + sum);
	}

}
