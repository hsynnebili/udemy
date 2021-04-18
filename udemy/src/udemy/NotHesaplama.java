package udemy;

import java.util.Scanner;

public class NotHesaplama {
public static void main(String[] args) {
	
	int vize1;
	int vize2;
	int finalnot;
	double ortalama;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Lutfen vize1 notunuzu giriniz= ");
	vize1=scanner.nextInt();
	
	System.out.println("Lutfen vize2 notunuzu giriniz= ");
	vize2=scanner.nextInt();

	System.out.println("Lutfen final notunuzu giriniz= ");
	finalnot=scanner.nextInt();

	ortalama=(vize1*0.3)+(vize2*0.3)+(finalnot*0.4);
	
	
	if(ortalama>=90) {
		System.out.println("A ile gectiniz");
		
	}else if(ortalama>=80) {
		System.out.println("B ile gectiniz");
	}else if(ortalama>=70) {
		System.out.println("C ile gectiniz");
	}else if(ortalama>=60) {
		System.out.println("D ile gectiniz");
	}else {
		System.out.println("Kaldiniz");
	}

}
}
