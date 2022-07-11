package by.academy.massiv.massivov;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = 0;
		int[][] mas = { { 1, 2, 3, 4, 5 }, { 2, -2, -4, 2, 3 }, { 3, 4, 5, 6, 7 }, { 1, 2, 3, 5, 7 },
				{ -3, 4, 5, 6, 7 } };
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
		}
		System.out.print("Summa = " + sum);

	}

}
