package by.academy.cikly;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x;
		int n;
		Long sum;
		sum = 1L;
		x = 1;
		sc = new Scanner(System.in);
		System.out.print("Vvedite czislo");
		System.out.print("> ");
		n = sc.nextInt();
		while (x <= n) {
			sum = sum * x;
			x = x + 1;
		}
		System.out.print("Faktorial = " + sum);
	}

}
