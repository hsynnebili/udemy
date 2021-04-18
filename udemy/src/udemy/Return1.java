package udemy;

public class Return1 {
	public static int ikiiletopla(int a) {
		return a + 2;

	}

	public static int ikiilecikartma(int a) {
		return a - 2;
	}
	public static int ikiilecarpma(int a) {
	return a*2;
	}
	public static int ikiilebolme(int a) {
		return a/2;
	}
	
	public static void main(String[] args) {
		
		

	
	System.out.println("Sonuc= "+(ikiilebolme(ikiilecarpma(ikiilecikartma(ikiiletopla(3))))));
}}
