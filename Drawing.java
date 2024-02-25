package CoreJavaTraining;

public interface Drawing
{
   //abstract method
	void draw();
    void sketch();
  
   
   
}

class Square implements Drawing
{
	
	//body of asbstract methods
	public void draw() {
	System.out.println("I am a draw method");	
	}


	public void sketch() {
		System.out.println("I am sketch method");
		
	}
	
}
 class Testing
{
	public static void main(String[] args) {
		Drawing d1=new Square();
		d1.draw();
		d1.sketch();
	}
}




