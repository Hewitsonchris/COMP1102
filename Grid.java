public class Grid
{
	public static final int SIZE = 3;
    private char myGrid[][] = new char[SIZE ][SIZE] ;
    private static final char EMPTY = ' ';
    private Umpire umpire;

    /**
     * Initialise squares to empty character
     */
    public Grid()
    {
        for(int i=0; i<SIZE ; i++)
            for (int j=0; j<SIZE ; j++)
                myGrid[i][j] = EMPTY;
    }    

    public void setUmpire(Umpire u) {
    	umpire = u;
    }
    
    public void printGrid()
    {  
        for(int r=0; r<SIZE ; r++)
        {
            for (int c=0; c<SIZE ; c++) 
                System.out.print(myGrid[r][c]);
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean placeToken(int r, int c, char t) {
    	boolean ok = umpire.checkMove(r,c);
    	if (ok)
    		myGrid[r][c] = t;
    	return ok;
    }
    
    public char getTokenOnSquare(int r, int c) {
    	return myGrid[r][c];
    }
    
    public boolean isFull()
    {
      boolean isFull = true;  
      for(int r=0; r<SIZE ; r++)
         for (int c=0; c<SIZE ; c++) 
             if(squareEmpty(r, c))
                isFull = false;
      return isFull;
    }   

    public boolean squareEmpty(int r, int c) {
    	return myGrid[r][c] == EMPTY;
    }   
    
    public int getGridSize() {
    	return SIZE;
    }



}
