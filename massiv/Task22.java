package by.academy.massiv;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Invalid input!!! Enter the first value: ");
		}
		x = sc.nextDouble();
		System.out.print("Enter the second value: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Invalid input. Enter the second value: ");
		}
		y = sc.nextDouble();

		sum(x, y);
		difference(x, y);
		composition(x, y);
		quotient(x, y);

	}

	public static void sum(double a, double b) {
		double sum;
		sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}

	public static void difference(double a, double b) {
		double sum;
		sum = a - b;
		System.out.println(a + " + " + b + " = " + sum);
	}

	public static void composition(double a, double b) {
		double sum;
		sum = a * b;
		System.out.println(a + " + " + b + " = " + sum);
	}

	public static void quotient(double a, double b) {
		double sum;
		sum = a / b;
		System.out.println(a + " + " + b + " = " + sum);
	}
}
