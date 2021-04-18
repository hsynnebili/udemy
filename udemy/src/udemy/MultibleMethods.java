package udemy;

public class MultibleMethods {
	public static void method1(int a){
	    System.out.println(a);
	  }
	  public static void method2(String  name){
	    System.out.println(name);
	  }
	  public static void method3(double b){
	    System.out.println(b);
	  }
	  public static void method4(float c){
	    System.out.println(c);
	  }
	  public static void main(String[] args) {
	    method1(100);
	    method2("SyntaxSolutions");
	    method3(100.09);
	    method4( (float) 200.0998);
	    System.out.println("----------------");
	    method1(100);
	    method2("SyntaxSolutions");
	    method3(100.09);
	    method4( (float) 200.0998);
	}}

