import java.util.Scanner; //Compile error without scanner imported

public class Task2 
{
    public static void main(String[] args)
    {
      
        Scanner in = new Scanner(System.in); //quotation marks compile error
        System.out.println("Please enter a double: "); //println not print
        double x = in.nextDouble();
        System.out.print("Please enter another double: ");
        double y = in.nextDouble();
        System.out.println("The sum is " + (x + y));
    }
}
