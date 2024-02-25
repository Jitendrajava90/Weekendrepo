package CoreJavaTraining;

public class private_accessmodifiers {
public static void main(String[] args) {
	A a1=new A();
	System.out.println(a1.a);
	a1.msg();
}
}

class A
{
	private int a=40;
	private void msg()
	{
		System.out.println("Hello JAVA ");
	}
}
