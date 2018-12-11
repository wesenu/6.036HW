
/**
 * Write a description of class BridgeItBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BridgeItBoard
{
    private AdjListsGraph<Vertex> myAdjGraph;//player's board

    /**
     * Constructor for objects of class BridgeItBoard
     */
    public BridgeItBoard(int playerNum)
    {
        myAdjGraph = new AdjListsGraph<Vertex>();
        if(playerNum == 1){//Blue
            for(int i = 0; i<5; i ++){
                for(int j = 0; j<4; j++){
                    myAdjGraph.addVertex(new Vertex(110*i+340,110*j+200,i,j));
                }
            }
        }

        if(playerNum == 2){//gray
            for(int i = 0; i<4; i ++){
                for(int j = 0; j<5; j++){
                    myAdjGraph.addVertex(new Vertex(110*i+395,110*j+150,j,i));
                }
            }
        }
    }

    public int getNumVertices() { 
        return myAdjGraph.getNumVertices(); 
    }

    public Vertex getVertex(int i){
        return myAdjGraph.getVertex(i);
    }

    public void addEdge (Vertex vertex1, Vertex vertex2) {
        myAdjGraph.addEdge(vertex1,vertex2);
        setConnected(vertex1,true);
        setConnected(vertex2,true);    
        vertex1.increaseDegree();
        vertex2.increaseDegree();        
    }
    
    /**
     * check whether a path is found from the start vertex to the end vertex
     * @param the start vertex
     * @param the end vertex 
       */
    public boolean pathDFS(Vertex vertex1, Vertex vertex2){
        return(myAdjGraph.pathDFS(vertex1, vertex2) == null);
    }
    /**
     * marks a vertex as connected or disconnected
     *@param whether the vertex is connected 
     *@param the target vertex 
     */
    public void setConnected(Vertex target, boolean co){
        target.setConnected(co);
    }
}
