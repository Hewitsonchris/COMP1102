public class Bug 
{
    int currentPosition, speed = 1;
    
    public Bug (int initialPosition)
    {
        currentPosition = initialPosition;
    }

     public void move()
     {
         currentPosition = currentPosition + speed;
     }
     
     public void turn()
     {
          speed = -speed;
     }
     
     public int getPosition()
     {
         return currentPosition;
                 
     }
}
