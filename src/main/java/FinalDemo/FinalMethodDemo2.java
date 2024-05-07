package FinalDemo;

public class FinalMethodDemo2 extends FinalMethodDemo
{	
	// Attempting to override the final method
    // This will result in a compilation error
    // Uncommenting this will result in compilation error
  
	//public void display() 
	// {
  //      System.out.println("This is an attempt to override the final method in the Child class.");
  //  }
	 
	public static void main(String[] args) {
		
		
		FinalMethodDemo parent = new FinalMethodDemo();
		FinalMethodDemo2 child = new FinalMethodDemo2();

        parent.display(); // Output: This is a final method in the Parent class.
        child.display();  // Output: This is a final method in the Parent class.
                          // Even though it's called on the Child object, it still invokes the parent's final method.
	}

}
