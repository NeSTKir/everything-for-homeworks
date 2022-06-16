package by.academy.vetvlenia;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 60;
		b = 90;
		if ((a + b) < 180) {
			if ((a == 90) || (b == 90)) {
				System.out.print("triugolnik priamougolny");
			} else {
				System.out.print("Suszestvuet takoj triugolnik");
			}
		} else {
			System.out.print("Net takogo triugolnika");
		}
	}

}
