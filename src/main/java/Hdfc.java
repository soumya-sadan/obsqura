
public class Hdfc implements RBI 
{

	@Override
	public double recurringDeposit(double amt, int duration) 
	{
		// TODO Auto-generated method stub
     double interest = amt * rate * duration;
     return (amt + interest);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 Hdfc hdfc = new Hdfc();
 
 double total = hdfc.recurringDeposit(13450.67,3);
 System.out.println("Total amount : " + total);
	}

}
