package StringDemoPalindromecheck;
public class Palindrome 
{
	
		    public static boolean checkPalindrome(String str)
		    {
	         int first = 0;
	        int last = str.length() - 1;
	        
	        while (first < last) 
	        {
	            
	            if (str.charAt(first) != str.charAt(last))
	            {
	                return false; //not palindrome
	            }
	            
	            first++;
	            last--;
	        }
	        
	       
	        return true; //is a palingdrome
	    }
	    
	    public static void main(String[] args) {
	        String str = "malayalam";
	        
	        // Check if the string is a palindrom
	        if (checkPalindrome(str)) 
	        {
	            System.out.println(str + " is a palindrome.");
	        }
	        else 
	        {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }
	}




