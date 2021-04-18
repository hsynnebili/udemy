package udemy;

import java.util.Scanner;

public class DegiskenDegerleriniDegistirme {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	
	int birinci_sayi;
	int ikinci_sayi;
	
	System.out.println("Degistirilmeden Once: ");
	System.out.println("Birinci Sayi: ");
	birinci_sayi=scanner.nextInt();
	
	System.out.println("Ikinci Sayi: ");
	ikinci_sayi=scanner.nextInt();

	
	
	int gecici=birinci_sayi;
	birinci_sayi=ikinci_sayi;
	ikinci_sayi=gecici;
	
	System.out.println("Degistirildikten  Sonra: ");
	System.out.println("Birinci Sayi: "+birinci_sayi);
	System.out.println("Birinci Sayi: "+ikinci_sayi);
}
}
