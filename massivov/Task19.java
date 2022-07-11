package by.academy.massiv.massivov;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 6;
		int p;
		p = 1;
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			if ((i == 0) || (i == n - 1)) {
				for (int j = 0; j < n; j++) {
					mas[i][j] = 1;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
				System.out.println();
			}

			if ((i == 1) || (i == n - 2)) {
				for (int j = 0; j < n; j++) {
					if ((j > i - 1) && (j < n - 1)) {
						mas[i][j] = 1;
						System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
					} else {
						mas[i][j] = 0;
						System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
					}
				}
				System.out.println();
				// dorabotat cod

			}

		}
	}
}
