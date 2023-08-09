package low_level_system_design;
// Example of HAS-A and IS-A relationship Java
abstract class Car
{
	private int maxSpeed;
	private String color;
	Car(int maxSpeed,String color)
	{
		this.maxSpeed = maxSpeed;
		this.color = new String(color);
	}
	public void carInfo()
	{
		System.out.println("Car Color= " + color
                + " Max Speed= " + maxSpeed);
	}
	abstract void demoRun();
}
class Maserati extends Car   // IS-A relationship (Inheritance)
{
	private String name;
	// Maserati is a type of car that extends the Car class that shows Maserati is a Car
	Maserati(int maxSpeed, String color,String name) 
	{
		super(maxSpeed, color);
		this.name = new String(name);
		// TODO Auto-generated constructor stub
	}
	public void carInfo()   // overriding
	{
		System.out.println("Car name Maserati "+name);
		super.carInfo();
	}
	public void demoRun()
	{
		Engine MaseratiEngine = new Engine();  // HAS-A Relationship
		// A car has a engine. An object has another object
		System.out.println("Demo Run of car "+name);
		MaseratiEngine.startEngine();
		MaseratiEngine.stopEngine();
	}
}
class Engine
{
	public void startEngine()
	{
		System.out.println("Engine Started");
	}
	public void stopEngine()
	{
		System.out.println("Engine Stopped");
	}
}
public class Prog99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Ghibli = new Maserati(329,"Red","Ghibli");
		Ghibli.carInfo();
		Ghibli.demoRun();
	}

}
