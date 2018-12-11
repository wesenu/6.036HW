
/**
 * Write a description of class Vertex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vertex
{
    // instance variables - replace the example below with your own
    private int xpos, ypos, xcord, ycord, width, height ;
    private boolean connected; 
    private int degree; 

    /**
     * Constructor for objects of class Vertex
     */
    public Vertex(int n, int m, int xc, int yc)
    {
        xpos = n;
        ypos = m;
        width = 30;
        height = 30;
        xcord = xc;
        ycord = yc;
        degree = 0;
    }

    public int getXpos(){
        return xpos;
    }

    public int getYpos(){
        return ypos;
    }

    public int getXcord(){
        return xcord;
    }

    public int getYcord(){
        return ycord;
    }

    public int getDegree(){
        return degree;
    }
        public void increaseDegree(){
         degree++;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setConnected(boolean c){
        connected= c;
    }

    public boolean getConnected(){
        return connected;
    }
}
