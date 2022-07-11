package by.academy.massiv.massivov;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 6;
		int p;
		p = 1;
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= (n - i)) {
					mas[i][j] = 0;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				} else {
					mas[i][j] = p;
					System.out.print("mas[" + i + "][" + j + "] = " + mas[i][j] + "; ");
				}
			}

			System.out.println();
			p++;
		}

	}
}
