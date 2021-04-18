package recap;

 public interface  Vehicle {
	
	public void changeGear(int a);
	public void speedUp(int a);
	public void applyBrakes(int a);
	
	
}
 
 class Bicycle implements Vehicle{
	 
	 int speed;
	 int gear;

	@Override
	public void changeGear(int newGear) {
		
		gear = newGear;
		
	}

	@Override
	public void speedUp(int increment) {
		
		speed=speed + increment;
		
	}

	@Override
	public void applyBrakes(int decrement) {
		
		speed = speed -decrement;
		
	}
	
//	public void printStates() {
//		
//		System.out.println("speed : "+ speed + 
//				"gear" + gear);
		
//	}

	
	public void printStates() {
		System.out.println("speed : "+ speed + 
				"gear" + gear);
		
	}
 }
 class Bike implements Vehicle{

	 
	 int speed;
	 int gear;
	 
	 
	@Override
	public void changeGear(int newGear) {
		
		gear = newGear;
		
	}

	@Override
	public void speedUp(int increment) {
		speed = speed - increment;
		
	}

	@Override
	public void applyBrakes(int decrement) {
		
		speed = speed - decrement;
		
	}

	
	public void printStates() {
		System.out.println("speed : "+ speed + 
				"gear" + gear);
		
	}
	 
 }
 
 class GFG{
	 public static void main(String[] args) {
		
		 
		 Bicycle bicycle = new Bicycle();
		 bicycle.changeGear(2);
		 
		 
		 
		
		 
	}
 }