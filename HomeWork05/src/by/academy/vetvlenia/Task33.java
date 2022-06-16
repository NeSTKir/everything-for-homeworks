package by.academy.vetvlenia;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int x;
		System.out.print("Vvedite parol");
		sc = new Scanner(System.in);
		System.out.print("> ");
		x = sc.nextInt();
		if ((x == 9583) || (x == 1747)) {
			System.out.print("Dostup A,B,C");
		} else if ((x == 3331) || (x == 7921)) {
			System.out.print("Dostup B,C");
		} else if ((x == 9455) || (x == 8997)) {
			System.out.print("Dostup C");
		} else {
			System.out.print("Net dostupa");
		}
	}

}
