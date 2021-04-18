package udemy;

import java.util.Scanner;

public class Faktoriyel {
public static void main(String[] args) {
	int faktoriyel=1;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Lutfen bir sayi giriniz");
	int sayi=scanner.nextInt();
	
	for(int i=1; i<=sayi; i++) {
	 faktoriyel*=i;
	 System.out.println("Faktoriyel= "+faktoriyel+" i= "+i);
	}
	System.out.println("Faktoriyel= "+faktoriyel);
}
}
