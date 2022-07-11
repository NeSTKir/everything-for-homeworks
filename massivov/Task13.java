package by.academy.massiv.massivov;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 6;
		int p;
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				for (int j = 0; j < n; j++) {
					mas[i][j] = j + 1;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
			}

			System.out.println();

			if (i % 2 != 0) {
				p = n;
				for (int j = 0; j < n; j++) {
					mas[i][j] = p;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
					--p;
				}
			}

			System.out.println();

			if ((i != 0) && (i % 2 == 0)) {
				for (int j = 0; j < n; j++) {
					mas[i][j] = j + 1;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
			}

			System.out.println();
		}
	}

}
