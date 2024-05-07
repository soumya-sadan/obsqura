package PolymorphismDemoDiscountCalculator;

public class OnSeason extends Clothes 
{
	
	 public void discount() 
	 {
	     System.out.println("Discount during Onseason is 40%");
	 }
	

	
	 public static void main(String[] args) 
	 {
	     Clothes on = new OnSeason();
	     Clothes off = new OffSeason();
  
	     on.discount(); 
	     off.discount(); 
	     //na.discount();
	 }
	
}
	

	


