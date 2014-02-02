public class BugTester 
{
    public static void main(String[] args)
	{
		Bug bugsy = new Bug(10);
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		bugsy.move();
                bugsy.move();
                bugsy.move();
		bugsy.turn();
                bugsy.move();
	
		System.out.println("Bugsy's position is " + bugsy.getPosition());
		System.out.println("Expected: 8");
	}

}
