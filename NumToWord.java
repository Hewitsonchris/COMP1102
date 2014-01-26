import java.util.*;

public class NumToWord
{
    public static void main (String [] args)
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter an integar between 0 and 999999999: ");
     int num = scan.nextInt();
     
     do
     {
         System.out.println("You entered a negative number.");
         System.out.println("Try again, enter an integar between 0 and 999999999: ");
         num = scan.nextInt();
     }
     while (num <0);

     do
     {
         System.out.println("The number you entered was too high");
         System.out.println("Try again, enter an integar between 0 and 999999999: ");
         num = scan.nextInt();
     }
     while (num > 1000000);
     
     System.out.println(TransformToText(num));
    }

    
    static String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
               
    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
               
    static String TransformToText(int num)
    {
        if (num >= 0 && num < 20)
        {
            return TransformUnitToText(num);
        }

        if (num < 100)
        {
             return TransformTensToText(num);  
        }                                              

        if (num < 1000)
        {
            return TransformHundredsToText(num); 
        }

        if (num < 1000000)
        {
            return TransformThousandsToText(num);
            
        }
        
        if (num < 1000000)
        {
            return TransformMillionsToText(num);
        }
        return "Invalid input - number too high";
    }  
     
    static String TransformMillionsToText(int num)
    {
        return TransformToText(num/ 1000000) + " Million,"+ ((num % 1000000 > 0) ? " " + TransformToText(num % 1000000) : "");
    }
   
    static String TransformThousandsToText(int num)
    {
        return TransformToText(num / 1000) + " Thousand," + ((num % 1000 > 0) ? " " + TransformToText(num % 1000) : "");
    }
     
    static String TransformHundredsToText(int num)
    {
       return units[num / 100] + " Hundred" + ((num % 100 > 0) ? " and " + TransformToText(num % 100) : "");
    }
     
    static String TransformTensToText(int num)
    {
        return tens[num / 10] + ((num % 10 > 0) ? "-" + TransformToText(num % 10) : "");
    }
     
    static String TransformUnitToText(int num)
    {
        return units[num];
    }
}
   
