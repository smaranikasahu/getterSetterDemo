package gettersetterDemo;

public class ClassDemo {

	public static void main(String[] args) {
		
		Cars b= new Cars();
		b.setMake("Benz");
		System.out.println("Make of Car is "+b.getMake());
		
		Cars c= new Cars();
		b.setMake("Britz");
		System.out.println("Make of car is "+b.getMake());
		
		b.setColor("red");
		System.out.println("Color of Car is"+b.getColor());
		
		c.setModel("SZ52");
		System.out.println("Model of Car is "+c.getModel());
		
		c.setYear(2012);
		System.out.println("Year of manufacture is"+c.getYear());
	
		
		
	}

}
