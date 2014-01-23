import java.util.*;
public class Task1
{
    public  static void main (String [] args)
    {
        String first, second, third, s1, s2, s3;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter three token strings separated by spaces: ");
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        first = s1;
        second = s2;
        third = s3;
        
        if (s1.compareTo(s2) <= 0 && s1.compareTo(s3) <= 0)
        {
           first = s1;

           if (s2.compareTo(s3) <= 0)
           {
              second = s2;
              third = s3;
           }
           else
           {
              second = s3;
              third = s2;
           }
        }

        if (s2.compareTo(s1) <= 0 && s2.compareTo(s3) <= 0)
        {
           first = s2;

           if (s1.compareTo(s3) <= 0)
           {
               second = s1;
               third = s3;
           }
           else
           {
               second = s3;
               third = s1;
           }
        }

        if (s3.compareTo(s1) <= 0 &&  s3.compareTo(s2) <=0)
        {
           first = s3;

           if (s1.compareTo(s2)<= 0)
           {
                second = s1;
                third = s2;
            }
            else
            {
                second = s2;
                third = s1;
            }
        }
        
     System.out.println (first);
     System.out.println (second);
     System.out.println (third);
        
    }
}
