import java.util.Random;
public class MontyHall 
{
    public static void main(String[] args)
    {
        int switchWins = 0;
        int stayWins = 0;
        final int DOORS = 3;
        int doorCar;
        int doorPlayer;
        int plays;
        final int TOTAL_PLAYS = 1000;
        
        Random gen = new Random();
        
        for(plays = 0;plays <= TOTAL_PLAYS; plays++)
        {
            doorPlayer = gen.nextInt(DOORS);
            doorCar = gen.nextInt(DOORS);
            
            if ( doorCar != doorPlayer )
            {
                switchWins++;
            }
            else
            {
                stayWins++;
            }
           
        }
    System.out.println("Switching wins " + switchWins + " times.");
    System.out.println("Staying wins " + stayWins + " times.");
}
    
}
