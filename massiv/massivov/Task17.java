package by.academy.massiv.massivov;

public class Task17 {

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
				if ((i == 0) || (j == 0)) {
					mas[i][j] = 1;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
				if ((i != 0) && (j != 0)) {
					if ((i == n - 1) || (j == n - 1)) {
						mas[i][j] = 1;
						System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
					}

				}

				if ((i != 0) && (j != 0) && (i != n - 1) && (j != n - 1)) {
					mas[i][j] = 0;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}

			}
			System.out.println();
		}

	}
}
