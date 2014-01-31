import java.util.Scanner;
public class StringModifyer 
{
    public static void main (String [] args)
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a string with a combination of upper and lowercase characters: ");
     String string = scan.nextLine();
     
     System.out.println(upperCase(string));  
     System.out.println(everySecondLetter(string));
     System.out.println(replaceVowelUnderscore(string));
     System.out.println(stringReversed(string));
    }
    
    public static String upperCase(String string)
    {
        string = string.toUpperCase();
        return string;
    }
     
    
}
