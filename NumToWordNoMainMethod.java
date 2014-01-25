import java.util.*;

public class NumToWordNoMain
{
    String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                       "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
               
    String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
               
    
    String TransformToText(int num)
    {
        if (num < 20)
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
        
        return TransformMillionsToText(num);
    }  
     
    String TransformMillionsToText(int num)
    {
        return TransformToText(num/ 1000000) + " Million "+ ((num % 1000000 > 0) ? " " + TransformToText(num % 1000000) : "");
    }
   
    String TransformThousandsToText(int num)
    {
        return TransformToText(num / 1000) + " Thousand " + ((num % 1000 > 0) ? " " + TransformToText(num % 1000) : "");
    }
     
    String TransformHundredsToText(int num)
    {
       return units[num / 100] + " Hundred" + ((num % 100 > 0) ? " and " + TransformToText(num % 100) : "");
    }
     
    String TransformTensToText(int num)
    {
        return tens[num / 10] + ((num % 10 > 0) ? " " + TransformToText(num % 10) : "");
    }
     
    String TransformUnitToText(int num)
    {
        return units[num];
    }
}
   
