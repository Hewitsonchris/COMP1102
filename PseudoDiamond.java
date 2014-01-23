import java.util.*;     
public class Diamond
{
    public static void main (String [] args)
    {  
        int length;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of a side: ");
        length = scan.nextInt();
        
        for (int i = 1; i <= length; i++)
        {           
            // print spaces for <=length (in pyramid)
            for (int j = 1; j <= length - i; j++)
            {
                System.out.print(" ");
            }
             
            // print asterisks for top (pyramid)
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     
// When printed pyramid (length), exit loop and start printing cone beneath
     
        
// The project has been divided into two parts.  Printing the top pyramid 
// Prior to printing the bottom cone
// This is easier then writing loops to account for the size ((length*2) -1)
        
        
        // for each line of the bottom (cone)
        for (int i = length - 1; i >= 1; i--)
        {           
            // print spaces for bottom (cone)
            for (int j = 1; j <= length - i; j++)
            {
                System.out.print(" ");
            }
             
            // print asterisks
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
