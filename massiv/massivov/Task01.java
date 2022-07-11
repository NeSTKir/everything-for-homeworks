package by.academy.massiv.massivov;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" mas[" + i + "][" + j + "] = " + mas[i][j]);
			}
			System.out.println();
		}
	}

}
