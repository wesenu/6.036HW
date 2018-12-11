/**
 * Write a description of class Arc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Edge
{
    // instance variables - replace the example below with your own

    private boolean isAlive, marked;

    /**
     * Constructor for objects of class Arc
     */
    public Edge(Vertex a, Vertex b)
    {
        isAlive = true; 
        marked = false; 
    }
    
    public void block(){
        isAlive = false;
    }
 
    
}
