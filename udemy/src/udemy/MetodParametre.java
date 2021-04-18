package udemy;

public class MetodParametre {
	public static void cikarma(int a, int b ,int c) {
		System.out.println("Sayilarin farki= "+(a-2*b+c));
	}
	public static void toplama(int a, int b,int c) {
		System.out.println("Toplamlari= "+(a+b+c));
	}
	
	public static void selamlama(String isim) {
		System.out.println("Selamlar "+isim);
	}
public static void main(String[] args) {
	selamlama("Huseyin");
	selamlama("Serra");
	toplama(12,14,15);
	cikarma(2,4,7);
}
}
