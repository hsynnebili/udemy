package string;

public class String1 {
public static void main(String[] args) {
	String s="      World war started     ";
	String s1="world";
	
	System.out.println(s.toLowerCase());
	System.out.println(s1.toUpperCase());
	
	if(s1.startsWith("W")) {
		System.out.println("This is a big world war");
		
	}
	if(s1.endsWith("War")) {
		System.out.println("it was a awful war");
	}
	
	if(s.equals(s1)) {
		System.out.println("a lot of people were died");
	}
	if(s.equalsIgnoreCase(s1)) {
		System.out.println("There are two big worldwars");
	}
	if(s.equals(s1)) {
		System.out.println("s is equal s1");
	}
	 System.out.println(s.charAt(3));
	 System.out.println(s.indexOf("o"));
	 System.out.println(s.substring(3,12));
	 System.out.println(s.replace("World","started"));
	 System.out.println(s.trim());
}
}
