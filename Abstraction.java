package CoreJavaTraining;

public class Abstraction {
public static void main(String[] args) {
	Doggy d1=new Doggy();
	d1.sleep();
	d1.animalsound();
	
}
}
//abstract class
abstract class Animal
{//abstract method
	
	public abstract void animalsound();//there is no body of abstract method
	//non abstract method
	public void sleep()
	{
		System.out.println("Hello-Non abstrat method");
	}	
}
class Doggy extends Animal
{

	public void animalsound()
	{
		System.out.println("Hi-I am body of abstract method");
	}
}