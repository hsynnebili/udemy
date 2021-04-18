package udemy;

import java.util.Scanner;

public class Inputalma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yasinizi girin: ");
		int yas = scanner.nextInt();
		System.out.println('"Yasiniz: " + yas);
*/
		
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen Yasinizi Giriniz= ");
		int yas=scanner.nextInt();
		System.out.println("Yasiniz = " +yas);
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Isminiz: ");
		String isim=scanner.nextLine();
		
		System.out.println("Yasiniz: ");
		int yas=scanner.nextInt();
		
		
		System.out.println("Isminiz: "+isim);
		System.out.println("Yasiniz: "+yas);
		
		*/
		
		  //nextInt'ten sonra nextLine alinamaz.Once nextLine sonra nextInt gelmeli.
		
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi1=scanner.nextInt();
		
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi2=scanner.nextInt();
		
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi3=scanner.nextInt();
		System.out.println("Sayi 1: "+sayi1+" Sayi 2: "+sayi2+" Sayi 3:	"+sayi3);
		
	}

}
