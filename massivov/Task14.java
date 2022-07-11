package by.academy.massiv.massivov;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 6;
		int p;
		p = n;
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j + 1) == n) {
					mas[i][j] = p;
					--p;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				} else {
					mas[i][j] = 0;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
			}
			System.out.println();
		}

	}
}
