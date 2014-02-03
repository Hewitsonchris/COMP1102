import java.util.Random;
import java.util.Scanner;

public class HiLo
{
 
   public static void main (String[] args)
   {
      
      int num, count = 0, guess;
      String play;
      
      Scanner scan = new Scanner(System.in);
      Scanner scanForPlay = new Scanner(System.in);
      Random generator = new Random();

      do
      {
         num = generator.nextInt(101);
         
         do
         {
            System.out.println();
            System.out.println("Guess a number between 1 and 100(0 to quit): ");
            guess = scan.nextInt();
            count = count +1;

            if (guess > 0)
            {
               if (guess == num)
               {
                  System.out.println("Correct! Number of guesses equals: " + count);
               }
               else
                  if (guess < num)
                  {
                     System.out.println("LOW.");
                  }
                  else
                     System.out.println("HIGH.");
            }
         }
         while (guess != num && guess > 0);
        
         System.out.println("Play again (y/n)?: ");
         play = scanForPlay.nextLine(); 
      }
      while (play.equalsIgnoreCase ("y"));
      System.out.println("Goodbye, thanks for playing.");
    }  
}
