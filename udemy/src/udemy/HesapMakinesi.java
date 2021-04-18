package udemy;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {

		int sonuc = 0 ;
		int islemler=4 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen a degerini  giriniz");
		int a = scanner.nextInt();
		System.out.println("Lutfen b degerini  giriniz");
		int b = scanner.nextInt();
		
		System.out.println("Lutfen bir islem seciniz");
		 islemler=scanner.nextInt();
		
		switch (islemler) {
		case 1:
			sonuc = (a+b);
			
			break;
		case 2:
			sonuc = (a-b);
			
			break;
		case 3:
			sonuc = (a*b);
			
			break;
		case 4:
			sonuc =(int) ( (double) a/b);
			
			break;
			default:
			System.out.println("Invalid");

		}
		System.out.println("Islem sonucunuz= " + sonuc);
	}
}