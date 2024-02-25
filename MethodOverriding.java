package CoreJavaTraining;

public class MethodOverriding  {
void calculation(double x)
{
	System.out.println("Square of number is "+(x*x));
}
public static void main(String[] args) {
	Squareroot s1=new Squareroot();
	s1.calculation(10.0);
	MethodOverriding m1=new Squareroot();
	m1.calculation(10.0);
}
}

class Squareroot extends MethodOverriding
{
	void calculation(double x)
	{
		System.out.println("Square root is "+ Math.sqrt(x));
	}
}