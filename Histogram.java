import java.util.Scanner;

public class Histogram
{
   public static void main (String [] args)
   {
      

      System.out.println ("Enter numbers between 0 and 100.");
      System.out.println ("Quit by entering -1 ");
      
   }
      

    public int populate(int i)
    {
      Scanner scan  = new Scanner (System.in);
      int[] range = new int [10];
      int b;
      i = scan.nextInt ();
      while (i >= 1 && i <= 100)
      {
         b = (i - 1) / 10;
         range[b] ++;
         i = scan.nextInt ();
      }

      // print histogram
      for (b = 0; b < 10; b++)
      {
         System.out.print ((10 * b + 1) + "-");
         System.out.print ((10 * b + 10) + "\t|");
         for (int count = 0; count < range[b]; count++)
            System.out.print ("*");
         System.out.println ();
      }
    }
      

   }


