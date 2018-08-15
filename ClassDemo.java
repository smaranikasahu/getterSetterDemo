package gettersetterDemo;

public class ClassDemo {

	public static void main(String[] args) {
		
		Cars b= new Cars();
		b.setMake("Benz");
		System.out.println(b.getMake());
		
		Cars c= new Cars();
		b.setMake("Britz");
		System.out.println(b.getMake());
		
		c.setModel("SZ52");
		System.out.println(c.getModel());
		
		c.setYear(2012);
		System.out.println(c.getYear());
	
		
		
	}

}
