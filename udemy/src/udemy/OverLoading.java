package udemy;

public class OverLoading {
	public static void toplama(String a,String b) {
		System.out.println(a+" "+b);
	}
	public static void toplama(int a, int b) {
		System.out.println("Toplamlari= "+(a+b));
	}
public static void toplama(int a,int b, int c) {
	System.out.println("Toplamlari= "+(a+b+c));
}
public static void main(String[] args) {
	toplama(2,5,8);
	toplama(2,5,9);
	toplama(3,5,8);
	toplama(2,5);
	toplama("Huseyin","Nebili");
	
}
}
