public class Task3 
{
    public static void main(String[] args) 
    {
        double a=0.002;
        double c;
       
        int x;          
        int y=32, z=24; // alphabetical precedence over declaration/assignment

        c = z * a;
        x = z % y;
        
        System.out.println("Output is: "+c+", "+ x* (z/y));
    }
}
