package AbstractClass;

public class FullTimeEmployee extends Employee
{
	private double pay;
	
	FullTimeEmployee(double pay)
	{
		this.pay=pay;		
	}	
	public double calculateSalary(double pay)
	{
		double sal;
		sal= pay*8.00;
		return sal;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Contractor con = new Contractor(100344.4, 5);
        
        FullTimeEmployee full = new FullTimeEmployee(34323.55);
        
       double csal =  con.calculateSalary(100344.4,5);
        System.out.println("Salary for contractor:" + csal);
        
        double ftsal =  full.calculateSalary(100.1);
        System.out.println("Salary for full time employee:" + ftsal);
	}
	
}
