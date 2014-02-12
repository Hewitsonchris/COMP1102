import java.util.Scanner;

public class Histogram
{
   public static void main (String [] args)
   {
      

      System.out.println ("Enter some numbers between 0 and 100.");
      System.out.print ("Signal the end by entering ");
      System.out.println ("a number out of that range.");
   }
      

    public int populate(int i)
    {
      Scanner scan  = new Scanner (System.in);
      int[] ranges = new int [10];
      int box;
      i = scan.nextInt ();
      while (i >= 1 && i <= 100)
      {
         box = (i - 1) / 10;
         ranges[box] ++;
         i = scan.nextInt ();
      }

      // print histogram
      for (box = 0; box < 10; box++)
      {
         System.out.print ((10 * box + 1) + "-");
         System.out.print ((10 * box + 10) + "\t|");
         for (int count = 0; count < ranges[box]; count++)
            System.out.print ("*");
         System.out.println ();
      }
    }
      

   }


