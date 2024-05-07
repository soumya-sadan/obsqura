package EncapsulationDemoATM;

public class ATMSetValidatePin 
{
    private int validpins[] = {1001, 1234, 1212};
    private int pin;

   
    public void setpin(int pin) 
    {
        this.pin = pin;
    }

  
    public boolean validatepin() 
    {
      //  for (int valid : validpins) 
    	for(int i=0; i<=2;i++)
        {
            if (pin == validpins[i])
            {
                return true;
            }
        }
        return false;
    }
}


