package udemy;

//test case below (dont change):

class addTwo {

	int addTwo_Cal(int x, int y) {

		return x + y;

	}

	// test case below (dont change):
	public static void main(String[] args) {

		addTwo obj = new addTwo();

		System.out.println(obj.addTwo_Cal(3, 4)); // should be 7
		System.out.println(obj.addTwo_Cal(5, 6)); // should be 11
	}
}
