/**
 * The Player class represents the player class 
 *
 * @author (Caiqin Zhou, Yining Li, Jane Yang)
 * @version (v1)
 */
public class Player
{
    private String name;
    private int playerNum;
    private boolean isTurn, win;
    private BridgeItBoard myBridgeItBoard;//player's board
    
    public Player(String n, int num)
    {
        name = n;
        playerNum = num;
        isTurn = false;
        win = false;
        myBridgeItBoard = new BridgeItBoard(playerNum);

        // if(playerNum == 1){
            // for(int i = 0; i<5; i ++){
                // for(int j = 0; j<4; j++){
                    // myBoard.addVertex(new Vertex(110*i+340,110*j+200,i,j));
                // }
            // }
        // }

        // if(playerNum == 2){
            // for(int i = 0; i<4; i ++){
                // for(int j = 0; j<5; j++){
                    // myBoard.addVertex(new Vertex(110*i+400,110*j+150,i,j));
                // }
            // }
        // }
    }

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        name = "Lingling";
        isTurn = false;
        win = false;
    }

    // public void checkConnection(Vertex target){
        // for (int i = 0; 
    // }
    
    
    public String getName()
    {
        return name;
    }
    public int getNum()
    {
        return playerNum;
    }
    public BridgeItBoard getBoard(){
        return myBridgeItBoard;
    }

    public boolean getIsTurn(){
        return isTurn;
    }

    public int getVertexIndex(int xc, int yc){
        int resultIndex = 0;
        for(int i = 0; i<myBridgeItBoard.getNumVertices(); i ++){
                if(myBridgeItBoard.getVertex(i).getXcord() ==xc && myBridgeItBoard.getVertex(i).getYcord() ==yc){
                    resultIndex = i;
           }
        }
        return resultIndex;
    }
    
    public void setIsTurn(boolean x){
        isTurn = x;
    }

    public void setWin(boolean w){
        win = w;
    }

}
