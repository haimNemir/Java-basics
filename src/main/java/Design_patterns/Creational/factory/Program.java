package Design_patterns.Creational.factory;

public class Program {

	public static void main(String[] args) {
		
		//Circle c1 = new Circle(1, 2, 30);
		
		Shape s1 = ShapesFactory.createShape();
		Shape s2 = ShapesFactory.createShape();
		Shape s3 = ShapesFactory.createShape();
		Shape s4 = ShapesFactory.createShape();
		Shape s5 = ShapesFactory.createShape("circle");

		s1.print();
		s2.print();
		s3.print();
		s4.print();
		s5.print();
		
		
	}

}
