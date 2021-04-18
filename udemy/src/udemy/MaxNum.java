package udemy;

import java.util.Scanner;

public class MaxNum {
	public static void main(String[] args) {
		int maxNumber=1;
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=scanner.nextInt();
	
	System.out.println("Please enter second number");
	int b=scanner.nextInt();
			
	System.out.println("Please enter third number");
	int c=scanner.nextInt();
	
	if(a>=b && a>=c) {
		maxNumber=a;
	}else if(b>=a && b>=c) {
		maxNumber=b;	
	}else {
		maxNumber=c;
	}
	System.out.println("Maximum number is: "+maxNumber);
}
}