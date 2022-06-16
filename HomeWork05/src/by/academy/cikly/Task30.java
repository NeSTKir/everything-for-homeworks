package by.academy.cikly;

public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int czislo;
		String str;
		str = "VI";

		switch (str) {
		case "I":
			czislo = 1;
			break;
		case "II":
			czislo = 2;
			break;
		case "III":
			czislo = 3;
			break;
		case "IV":
			czislo = 4;
			break;
		case "V":
			czislo = 5;
			break;
		case "VI":
			czislo = 6;
			break;
		case "VII":
			czislo = 7;
			break;
		case "VIII":
			czislo = 8;
			break;
		case "XI":
			czislo = 9;
			break;
		case "X":
			czislo = 10;
			break;
		default:
			System.out.println("Eto nie rimskie czisla");
			return;
		}
		System.out.print("Czislo = " +czislo);
	}

}
