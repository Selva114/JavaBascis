/*package Bill;
import java.util.Scanner;

public class EbCalculation {
    public static void main(String[] args) {
        int units;
        double billAmount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer type (1 for Domestic, 2 for Hand-loom in Residence): ");
        int customerType = sc.nextInt();

        System.out.println("Enter the units: ");
        units = sc.nextInt();

        if (customerType == 1) {
            // Domestic Customer
            if (units <= 100) {
                billAmount = 0;
            } else if (units <= 200) {
                billAmount = (units - 100) * 2.50;
            } else if (units <= 400) {
                billAmount = 100 * 2.50 + (units - 200) * 4.50;
            } else if (units <= 500) {
                billAmount = 100 * 2.50 + 200 * 4.50 + (units - 400) * 6.00;
            } 
            
            
            
            
            else {
                // For units above 500
                billAmount = 100 * 2.50 + 200 * 4.50 + 100 * 6.00 + (units - 500) * 8.00;
            }
        } 
        
        
        
        
        
        
        
        else if (customerType == 2) {
            // Hand-loom in Residence Customer
            if (units <= 200) {
                billAmount = 0;
            } else if (units <= 400) {
                billAmount = (units - 200) * 4.50;
            } else if (units <= 500) {
                billAmount = 200 * 4.50 + (units - 400) * 6.00;
            } else {
                // For units above 500
                billAmount = 200 * 4.50 + 100 * 6.00 + (units - 500) * 8.00;
            }
        } else {
            System.out.println("Invalid customer type entered.");
            return;
        }

        System.out.println("Bill Amount = " + billAmount);
    }
}

*/
package Bill;
import java.util.Scanner;

public class EbCalculation {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); //Starts the process of scanning console/terminal
		System.out.println("Enter the unit consumed by customer   : ");
		double unit = sc.nextDouble();
		double  limit=500;
		double total=0;
	
	if(unit<=limit)
	{
	 if(0<=100)
		{
			 //total= unit*0;
			System.out.println("Your monthly current bill is  :" + (unit*0));
		}
		if(101<=200)
		{
			 //total= unit*2.5;
			System.out.println("Your monthly current bill is  :" + (unit*2.25));
		}
		
		if(201<=400)
		{
			// total= unit*4.50;
			System.out.println("Your monthly current bill is  :" + (unit*4.50));
		}
		
		if(401<=500)
		{
			 //total= unit*6.0;
			System.out.println("Your monthly current bill is  :" + (unit*6.0));
	
		}
		//System.out.println("your monthly current bill is : " + total);
	}
	
	else 
	{
		if(0<=100)
		{
			//total= unit*0;	
			System.out.println("Your monthly current bill is  :" + (unit*0));
		}
	
		if(101<=400)
		{
			//total= unit*4.5;
			System.out.println("Your monthly current bill is  :" + (unit*4.50));
		}
		
		if(401<=500)
		{
			//total= unit*6.0;
			System.out.println("Your monthly current bill is  :" + (unit*6.0));
		}
		
		if(501<=600)
		{
			//total= unit*8.0;
			System.out.println("Your monthly current bill is  :" + (unit*8.0));
		}
		
		if(601<=800)
		{
			//total= unit*9.0;
			System.out.println("Your monthly current bill is  :" + (unit*9.0));
		}
		
		if(801<=1000)
		{
			//total= unit*10.0;
			System.out.println("Your monthly current bill is  :" + (unit*10.0));
		}
		
		
		if(unit<1000)
		{
			//total= unit*11.0;
			System.out.println("Your monthly current bill is  :" + (unit*11.0));
		}
		
	}
	//System.out.println("your monthly current bill is : " + total);
	
	sc.close();
	}
	
}
