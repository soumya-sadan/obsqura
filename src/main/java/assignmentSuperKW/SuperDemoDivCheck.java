package assignmentSuperKW;
public class SuperDemoDivCheck extends SuperDemoAddition
{
	boolean divcheck(int num1, int num2) 
	{
        int res = super.add(num1, num2);
        return res % 10 == 0;
	}    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperDemoDivCheck check = new SuperDemoDivCheck();
        int result = check.add(27, 15);
        System.out.println("Result of addition: " + result);
        boolean b = check.divcheck(27, 15);
        if (b==true)
        {
        	System.out.println("Number divisible by 10");
        }
        else
        {
        	System.out.println("Number NOT divisible by 10");
        }
	}

}
