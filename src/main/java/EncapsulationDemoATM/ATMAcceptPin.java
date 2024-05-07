package EncapsulationDemoATM;

public class ATMAcceptPin 
{

	    public static void main(String[] args) 
	    {
	    	ATMSetValidatePin obj = new ATMSetValidatePin();
	        int userpin = 1401;
	        obj.setpin(userpin);
	        if (obj.validatepin()) 
	        {
	            System.out.println("Pin is valid");	           
	        } 
	        else 
	        {
	            System.out.println("Invalid pin");
	        }
	        
	    }
	}
	
	
	


