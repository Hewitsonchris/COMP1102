/**
 * Takes user input angle (degrees) and  distance  (metres)  and  calculates  height  of  building  
 * 
 * @author (Chris Hewitson) 
 * @version (15/01/2014 ver. 1.00)
 */

import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        double distance, height, angleRadians, angleDegrees, tan;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter angle (in degrees): ");
        angleDegrees = in.nextDouble();
        
        while (angleDegrees == 90)
        { 
            System.out.println("Take a few steps back and try again: "); 
            angleDegrees = in.nextDouble();   
        }
        
        System.out.print("Please enter distance (in metres): ");       
        distance = in.nextDouble();
        angleRadians = Math.toRadians(angleDegrees);
        tan = Math.tan(angleRadians);
        height =tan* distance;
        
        System.out.printf("The height of the building is: " +"%.2f" + " metres", height);              
    }
}
        
      
