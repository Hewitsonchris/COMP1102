import java.util.Scanner;
public class Player
{
    private char myToken;
    
    public Player(char token)
    {
        myToken = token;
    }
    
    public char getToken()
    {
        return myToken;
    }      

    public void makeMove(Grid grid) {
    	boolean ok = false;
    	while (!ok) {
        //read row and column from user
    	  System.out.print("Place  " +  myToken 
               + " - Enter row and col sep by space : ");
    	  Scanner scanner = new Scanner(System.in);
    	  int row = scanner.nextInt();
    	  int col = scanner.nextInt();
    	  scanner.nextLine();

        //place token
    	  ok = grid.placeToken(row, col, myToken);
    	  if (!ok) {
    		System.out.println("Invalid move - try again");
    	  }
    	}
    }
}
