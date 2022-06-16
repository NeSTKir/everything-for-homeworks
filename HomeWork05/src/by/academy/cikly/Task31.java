package by.academy.cikly;

import java.util.Random;
import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, x1, x2, x3, x4;
		int y, y1, y2, y3, y4;
		int h;
		h = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		do {
		x = rand.nextInt(15);
		x1 = rand.nextInt(15);
		x2 = rand.nextInt(15);
		x3 = rand.nextInt(15);
		x4 = rand.nextInt(15);
		System.out.print("Vvedite czislo 1");
		System.out.print("> ");
		y = sc.nextInt();
		System.out.print("Vvedite czislo 2");
		System.out.print("> ");
		y1 = sc.nextInt();
		System.out.print("Vvedite czislo 1");
		System.out.print("> ");
		y2 = sc.nextInt();
		System.out.print("Vvedite czislo 1");
		System.out.print("> ");
		y3 = sc.nextInt();
		System.out.print("Vvedite czislo 1");
		System.out.print("> ");
		y4 = sc.nextInt();
		System.out.print(x+" "+x1+" "+x2+" "+x3+" "+x4);
		System.out.println(y+" "+y1+" "+y2+" "+y3+" "+y4);

		if ((y==x)||(y==x1)||(y==x2)||(y==x3)||(y==x4)) {
			System.out.println("Ty ugadal 1 czislo = "+y);
			h = h + 1;
		} else {
			System.out.println("Ty nie ugadal 1 czislo = "+y);
		}
		if ((y1==x)||(y1==x1)||(y1==x2)||(y1==x3)||(y1==x4)) {
			System.out.println("Ty ugadal 2 czislo = "+y1);
			h = h + 1;
		} else {
			System.out.println("Ty nie ugadal 2 czislo = "+y1);
		}
		if ((y2==x)||(y2==x1)||(y2==x2)||(y2==x3)||(y2==x4)) {
			System.out.println("Ty ugadal 2 czislo = "+y2);
			h = h + 1;
		} else {
			System.out.println("Ty nie ugadal 2 czislo = "+y2);
		}
		if ((y3==x)||(y3==x1)||(y3==x2)||(y3==x3)||(y3==x4)) {
			System.out.println("Ty ugadal 3 czislo = "+y3);
			h = h + 1;
		} else {
			System.out.println("Ty nie ugadal 3 czislo = "+y3);
		}
		if ((y4==x)||(y4==x1)||(y4==x2)||(y4==x3)||(y4==x4)) {
			System.out.println("Ty ugadal 3 czislo = "+y4);
			h = h + 1;
		} else {
			System.out.println("Ty nie ugadal 3 czislo = "+y4);
		} 
		}while (h != 5);
			System.out.println("Хорошего дня.");

	}
}