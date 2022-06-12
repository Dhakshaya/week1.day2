package week1.day2;

public class Car {

	public void applyBreak()
	{
		System.out.println("Apply Break");
	}
	
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	
	
	public boolean isswitchOnAC()
	{
		return true;
	}
	
	public void applyAcclerate()
	{
		System.out.println("Apply Acclerate");
	}
	
	public static void main(String[] args) {
		Car objcar = new Car();
		objcar.applyBreak();
		objcar.applyGear();
		System.out.println(objcar.isswitchOnAC());
		objcar.applyAcclerate();
		
	}
	
}
