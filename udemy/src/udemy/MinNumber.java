package udemy;

import java.util.Scanner;

public class MinNumber {
	public static void main(String[] args) {
		int minNum=0;
		
		Scanner scanner=new Scanner(System.in);			
		System.out.println("Please enter  first number");
		int a=scanner.nextInt();
		
		System.out.println("Please enter  second number");
		int b=scanner.nextInt();
		
		System.out.println("Please enter  third number");
		int c=scanner.nextInt();
		
		if(a<=b && a<=c) {
			minNum=a;
		}else if(b<=a && b<=c) {
			minNum=b;
		}else {
			minNum=c;
		}
		System.out.println("Minumum number is "+minNum);
		
	}

}
