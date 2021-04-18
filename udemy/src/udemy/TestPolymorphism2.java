package udemy;

public class TestPolymorphism2 {

	public static void main(String args[]) {
		System.out.println("-----1.called------------");
		
		Shape obj3=new Shape();
		obj3.draw();//1.called
		
		System.out.println("-----2.called------------");
		
		
		Shape s = new Rectangle();
		s.draw();//2.called
		
		System.out.println("------3.called-----------");
		
		Shape s1 = new Circle();
		s1.draw();//3.called
		
		System.out.println("--------4.called---------");
		
		Shape s2 = new Triangle();
		s2.draw();
		
		
		System.out.println("---------5.called--------");
		

		Triangle obj=new Triangle();
		obj.draw();
		
		
		Circle obj1=new Circle();
		obj1.draw();
		
		System.out.println("---------6.called--------");
		
		Shape s4=new Shape();
		s4.draw();
	}
}
