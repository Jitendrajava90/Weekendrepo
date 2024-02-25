package CoreJavaTraining;

public class Finalmethod {

}

class A
{
	final public void show()
	{
		System.out.println("In A Show methods");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("In B show methods");
	}
}