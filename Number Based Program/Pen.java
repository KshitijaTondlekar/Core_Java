// Using User defined Constructor with no argument
public class Pen {
	static String brand="XO";
	static double price= 10;
	String color;
	String name;
	
	public Pen()
	{
	 System.out.println("User Defined Constructor...no argument");
	}
	static{
		System.out.println("static initializer");
	}
	{
		System.out.println("non ststic initializer");
	}

}
