import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputeTax
{
   public static void main(String[] args)
   {
      final double RATE_LOW = 0.10;     
      final double RATE_MIDDLE = 0.15;
      final double RATE_HIGH = 0.25;

      String   status;
      double income;
      double tax = 0;
 
      DecimalFormat fmt = new DecimalFormat("$0.00");
      Scanner scan = new Scanner(System.in); 
 
      System.out.println("Enter marital status (S or M): ");
      status = scan.next();        
      System.out.print("Enter income = ");
      income = scan.nextDouble(); 
      
      if (status.equals("s") || status.equals("S"))
      {  
         if (income <= 0)
            System.out.println("Invalid income");
         else if (income <=8000)
            tax = RATE_LOW * income;
         else if (income <= 32000)
            tax = (RATE_MIDDLE * income)  + 800;               
         else
            tax = (RATE_HIGH * income) + 4400;
      }
      
      else
      {  
          if (income <= 0)
            System.out.println("Invalid income");
         else if (income <=16000)
            tax = RATE_LOW * income;
         else if ( income <= 64000 )
            tax = (RATE_MIDDLE * income) + 1600;
         else
            tax = RATE_HIGH * income + 8800;
      }

      System.out.println("Tax = " + fmt.format(tax));
   }
}
