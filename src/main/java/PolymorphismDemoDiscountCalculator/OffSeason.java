package PolymorphismDemoDiscountCalculator;

public class OffSeason extends Clothes 
{
	 
	 public void discount() 
	 {
	     System.out.println("Discount during Offseason is 15%");
	 }

	 public static void main(String[] args) 
	 {
	     Clothes on = new OnSeason();
	     Clothes off = new OffSeason();
	     Clothes na = new Clothes();
	     // Call discount method on OnSeason and OffSeason clothes
	     on.discount(); // Output: Discount during On Season 40%
	     off.discount(); // Output: Discount during Off Season 15%
	     na.discount();
	 }
	



}




