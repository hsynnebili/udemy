package udemy;

import java.util.Scanner;

public class BedenKitleIndeksi {
	public static void main(String[] args) {
		String durumunuz;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen kilonuzu giriniz(kg): ");
		int kilo = scanner.nextInt();

		System.out.println("Lutfen boyunuzu giriniz(m): ");
		double boy = scanner.nextDouble();

		double kbi = kilo / (boy * boy);
		System.out.println(kbi);

		if (kbi <= 16.5) {
			durumunuz = "Zayif";
		} else if (kbi >= 18.5 && kbi <= 25) {
			durumunuz = "Normal";

		} else if (kbi >= 25 && kbi <= 30) {
			durumunuz = "Fazla Kilolu";
		} else {
			durumunuz = "Obez";
		}
		System.out.println("Durumunuz: " + durumunuz);

	}
}
