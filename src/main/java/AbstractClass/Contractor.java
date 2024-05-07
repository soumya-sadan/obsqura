package AbstractClass;

public class Contractor extends Employee
{
private double pay;
private int hours;
	
	public double calculateSalary(double pay, int hours)
	{
		double sal;
		sal= pay*hours;
		return sal;
	}
	
	Contractor(double pay, int hours)
	{
		this.pay=pay;
		this.hours=hours;
	}
	
	//void display()
	//{
		
	//	System.out.println("Salary for contractor:" + sal)
	//}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Contractor con = new Contractor(100344.4, 5);     
	      	        
	    //   double csal =  con.calculateSalary(100344.4,5);
	        System.out.println("Salary for contractor:" + con.calculateSalary(100344.4,5));

	}

	

}
