public class Game
{
    private Grid grid;
    private Umpire umpire;
    private Player currentPlayer;
    private Player nextPlayer;

    //initialises grid and umpire
    // and player tokens -X always starts
    public Game()
    {
        grid = new Grid();
        umpire = new Umpire(grid);
        grid.setUmpire(umpire);
        currentPlayer = new Player( 'X');
        nextPlayer = new Player('O');
    }
    
     	//runs the game until there is a winner 
    //or a draw (grid full without winner)
    public void play()
    {
    	//game ends when winner or grid full
        boolean endGame = false;  //game starting so not ended
        //repeat until end of game
        while (!endGame)
        {
            //make  a move
        	currentPlayer.makeMove( grid);
            //show updated grid
            grid.printGrid();  
            //check status
            boolean wonNow = umpire.isWinner();
            boolean isDraw = umpire.isDraw();
            if (wonNow) //if won, print message
            {
                System.out.println(currentPlayer.getToken()+" wins");  
                endGame = true;
            }
            else if (isDraw)  //if draw, print message
            {
                System.out.println("Grid full - a draw");
                endGame = true;
            }
            else //ok to have another turn
            {
                this.swapPlayers();
            }
        }
    }  

    //swaps current and next player
    private void swapPlayers()
    {
        Player tempPlayer = currentPlayer;
        currentPlayer = nextPlayer;
        nextPlayer = tempPlayer;
    }
}
