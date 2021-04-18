package udemy;

import java.util.Scanner;

public class KitleBedeIndeksi {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Kilonuzu Giriniz: ");
	int kilo=scanner.nextInt();
	
	System.out.println("Boyunuzu Girin: (Ornek:1,72)");
	double boy=scanner.nextDouble();
	double bki=kilo/(boy*boy);
	
	System.out.println("Beden Kitle Indeksiniz: "+bki);
	
}
}
