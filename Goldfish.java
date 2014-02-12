import java.util.ArrayList;

public class Goldfish 
{
    ArrayList<String> memory = new ArrayList<String>(); 
    
    public static void main (String[] args)
    {
        Goldfish nugget = new Goldfish();
        System.out.println(nugget.freeCapacity());
        nugget.store("eggs");
        System.out.println(nugget.freeCapacity());
        nugget.store("bread");
        nugget.store("milk");
        nugget.store("soap powder");
        System.out.println(nugget.freeCapacity());
        System.out.println(nugget.speak());
        
    }
    
    void store(String item)
    {
//        do
//        {
//        memory.add(item);
//        }
//        while(memory.size()<=2);
        
        for (int i = 0; i<=2; i++)
        {
            memory.add(item);
        }
        if(memory.size()>2)
        {
            System.out.println("Memory capacity reached");
        } 
    }
    
    int freeCapacity()
    {
        if (memory.size()<2)
        {
            return (3 - memory.size());
        }
        else
            return 0;
    }
    
    String speak()
    {
        return memory.get(0);
    }
        
    
}
        
        
    
    
    
   // String speak()
    //{
     //   while memory
    //}
