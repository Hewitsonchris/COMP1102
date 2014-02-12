public class Umpire 
{
	private Grid grid;
	
	public Umpire(Grid g) {
		grid = g;
	}
	
	public boolean checkMove(int row, int col) 
    {
        boolean check=true;
            if (row < 0 || row > Grid.SIZE-1 || col < 0 || col > Grid.SIZE-1) 
            {
                check= false;
            }
            return check;
    }
	
	/**
	 * checks whether there is a draw
	 * @return true if there is a draw, false otherwise
	 */
	public boolean isDraw() 
	{
		return grid.isFull();
	}
    
    /**
     * Checks whether there is a winner in the grid
     * @return true if there is a winner, false otherwise
     */ 
    public boolean isWinner()
    {
    	//check for complete rows
    	for (int row = 0; row < Grid.SIZE; row ++ ) {
    		if (isWinnerInRow(row) ) 
    			return true;
    	}
    	//check for complete cols
    	for (int col = 0; col < Grid.SIZE; col ++ ) {
        		if (isWinnerInCol(col) ) 
        			return true;    
    	}
    	
    	//check for complete diagonals
    	if (isDiagLRWinner() || isDiagRLWinner() )	
    		return true;
        return false;

    }
    private boolean isWinnerInRow(int row) {
    	//false if first square is empty
    	if (grid.squareEmpty(row,0))
    		return false;
    	//check each remaining square against first one
		for (int col = 1; col < Grid.SIZE; col++) {
    		if (grid.getTokenOnSquare(row,0)
                    !=grid.getTokenOnSquare(row,col))
    			return false;
    	}
     	return true;  //only come here if everything the same
    }
    
    private boolean isWinnerInCol(int col) 
    {
    	//false if first square is empty
    	if (grid.squareEmpty(0,col))
        {
            return false;
        }
    	//check each remaining square against first one
	for (int row = 1; row < Grid.SIZE; row++) 
        {
            if (grid.getTokenOnSquare(0,col) !=grid.getTokenOnSquare(row,col))
            {
                return false;
            }
    	}
     	return true;  //only come here if everything the same
    }
     
     private boolean isDiagLRWinner()
     {
         if (grid.squareEmpty(0, 0))
         {
             return false;
         }
         for (int row = 1; row < Grid.SIZE; row++)
         {
             if (grid.getTokenOnSquare(0,0) !=grid.getTokenOnSquare(row,row))
             {
                 return false;
             }
         }
         return true;  //only come here if everything the same
     }
     
     private boolean isDiagRLWinner()
     {
         if (grid.squareEmpty(0, (Grid.SIZE -1)))
         {
             return false;
         }
         for (int row = 1; row < Grid.SIZE; row++)
         {
             if (grid.getTokenOnSquare(0,(Grid.SIZE -1)) !=grid.getTokenOnSquare(row,(Grid.SIZE -1) - row))
             {
                 return false;
             }
         }
         return true;  //only come here if everything the same
     }
}
