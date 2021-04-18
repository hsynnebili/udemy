package udemy;

public class Car {

	public String color;// null
	public static int totalCars;// 0

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "White";
		totalCars++;

		Car car2 = new Car();
		car2.color = "White";
		totalCars++;

		System.out.println("Total car we made is " + totalCars);

	}
}
