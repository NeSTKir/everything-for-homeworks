package by.academy.cikly;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double Z;
		Z = 0;
		Scanner sc;
		String str;
		String str1;
		String str2;
		String str3;
		String str4;
		String str5;
		str1 = "-";
		str2 = "+";
		str3 = "*";
		str4 = "/";
		str5 = "0";

		do {
			sc = new Scanner(System.in);
			System.out.print("Vvedite czislo x");
			System.out.print("> ");
			x = sc.nextDouble();

			sc = new Scanner(System.in);
			System.out.print("Vvedite czislo y");
			System.out.print("> ");
			y = sc.nextDouble();

			sc = new Scanner(System.in);
			System.out.print("Vvedite znak");
			System.out.print("> ");
			str = sc.nextLine();

			if (str.equals(str1)) {
				Z = x - y;
			}
			if (str.equals(str2)) {
				Z = x + y;
			}
			if (str.equals(str3)) {
				Z = x * y;
			}
			if (str.equals(str4)) {
				if (y == 0) {
					System.out.print("vyczislenie nie vozmozno");
				} else {
					Z = x / y;
				}
			}
			if (str.equals(str5)) {
				break;
			}
			System.out.println("Otvet = " + Z);

		} while (true);
		System.out.println("Horoszego dnia");
	}

}
