package gettersetterDemo;

public class Cars {
	
	private String color,make,model;
	public int year;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		if(year>1900) {
			this.year = year;	
			
		}
		else 
		{
			System.out.println("This year is not valid");
		}
	}

	public String getMake() {
		return make;
	}

	
	
	public void setMake(String make) {
		this.make=make;
	}

	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		
		return this.color;
	}

	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
}
