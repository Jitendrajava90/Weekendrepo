package CoreJavaTraining;

public class MethodOverloading
{
	 void sum(int x, int y)
	    {
		   System.out.println("The sum of two numbers are "+(x+y));
	    }
	
     void sum(int x, int y, int z)
	    {
		   System.out.println("The sum of three numbers are "+(x+y+z));
	    }
	 public static void main(String[] args)
	    {
		    MethodOverloading s1=new MethodOverloading();	
		    s1.sum(10, 20);
		    s1.sum(10, 20, 30);
	    }
}
