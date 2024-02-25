package CoreJavaTraining;

public class parameterizedconst {
	
	String name;
	int emp_id;
	
	parameterizedconst(String name, int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
    public static void main(String[] args) {
    	parameterizedconst p1=new parameterizedconst("naveen", 101);
    	parameterizedconst p2=new parameterizedconst("Jha", 102);
    	System.out.println("Employee 1 deatils :"+p1.name +" "+ p1.emp_id);
    	System.out.println("Employee 2 details :"+p2.name +" "+ p2.emp_id);
    }
}
