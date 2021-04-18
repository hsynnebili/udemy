package udemy;

public class Dog {
	
	static String breed="Husky";
	static int paws=4;
	String name;
	int weight;
	int height;
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProperties();
		breed="Alex";
		Dog dog2=new Dog();
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProperties();
		
		Dog dog3=new Dog();
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		//dog3.getDogProperties();
		
	}

	private void getDogProperties() {
		// TODO Auto-generated method stub
		System.out.println(name+" is a breed of "+breed+" and weight is "
				+weight+" and height is "+height);
	}

}
