import java.util.*;
public class SurprisinglyHelpfulBank 
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! Welcome to Surprisingly Helpful Bank. " + 
                           "My name is Sophia. What’s your name?");
        
        String name = in.nextLine();
        System.out.println("Nice to meet you, " + name + 
                           ". How much cash would you like today" +
                           " (in whole dollars only)?");
        
        int amount = in.nextInt();
       
        int num100 = amount /100;
        int num50 = amount %100 / 50;
        int num20 = amount %100 %50 / 20;
        int num10 = amount %100 %50 % 20 /10;
        int num5 = amount %100 %50 %20 %10 /5;
        int num2 = amount %100 %50 %20 %10 %5 /2;
        int num1 = amount %100 %50 %20 %10 %2; 

        System.out.println (num100 + " $100 notes");
        System.out.println (num50 + " $50 notes");	
        System.out.println (num20 + " $20 notes");	
        System.out.println (num10 + " $10 notes");	
        System.out.println (num5 + " $5 notes");
        System.out.println (num2 + " $2 coins");
        System.out.println (num1 + " $1 coin(s)");
    }
}
