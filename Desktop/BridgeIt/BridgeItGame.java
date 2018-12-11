

/**
 * BridgeItGame .
 *
 * @author (Caiqin Zhou, Yining Li, Jane Yang)
 * @version (v1)
 */
import javafoundations.*;
import java.util.*;
import java.io.*;

public class BridgeItGame
{

    private Player player1, player2;
    private Vector<Vertex> activeStart, activeEnd;  
    private Vector<Vertex> neighbors;
    private boolean[][] matrix;
    /**
     * Constructor for objects of class BridgeItGame
     */
    public BridgeItGame()
    {
        player1 = new Player("Phillip",1);
        player2 = new Player("Jesse",2);
        player1.setIsTurn(true);//start the game with player1's turn
        activeStart = new Vector<Vertex>();
        activeEnd = new Vector<Vertex>();       
        neighbors = new Vector<Vertex>();
        matrix = new boolean[4][7];
        for(int i = 0; i<4; i++){
            for(int j = 0; j<7; j++){
                matrix[i][j] = true;
            }
        }
    }

    public Player getPlayer1(){
        return player1;
    }

    public Player getPlayer2(){
        return player2;
    }

    public void move(){
        //add arc to the graph
        
        //disable the opponent's arc in that area
        
        //switch player's turn to false
        if(player1.getIsTurn()==true){
            player1.setIsTurn(false);
            player2.setIsTurn(true);
        }
        else{
            player2.setIsTurn(false);
            player1.setIsTurn(true);
        }
    }

    /**
     * checkMoveable() check whether one add the arc (make a move)
     * @return whether the move can be completed
     * @param the player that is making the move
     */
    public boolean checkMoveable(Player p){
        boolean result = false;
        //check the region of the board that's clicked
        
        
        //find the corresponding arc
        
        //check if the the arcs are already marked 

        return result;
    }

    /**
     * checkWin() check after each move if the current player is winning 
     * @param the player who just played 
     */
    public boolean checkWin(Player current){
        boolean result = false;
        //first check the necessary conditions for the current player to win: whether the vertices on the borders are connected
        if(!checkWinHelper(current)){
            return false;
        }
        else{
            for(int i = 0; i<activeStart.size(); i++){
                for(int j = 0; j<activeEnd.size(); j++){
                    result = current.getBoard().pathDFS(activeStart.elementAt(i),activeEnd.elementAt(i));
                }
            }
        }
        return result; 
    }
    /**
     * checkWinHelper() check after each move if the current player has a potential to win
     * by checking whether the vertices on the borders are connected 
     * if the current player number is 1
    startConnected indicates whether the leftmost vertices are connected
    endConnected indicates whether the rightmost vertices are connected
    if the current player number is 2
    startConnected indicates whether the topmost vertices are connected
    endConnected indicates whether the bottommost vertices are connected
     *@return boolean if vertices on the borders are connected 
     */
    public boolean checkWinHelper(Player current){
        boolean startConnected, endConnected;
        startConnected = endConnected = false;
        int currentIndex = 0;

        if(current.getNum() == 1){
            for(int i = 0; i<4; i ++){
                currentIndex = current.getVertexIndex(0,i);
                // System.out.println("Vertex " + currentIndex + " is " + current.getBoard().getVertex(currentIndex).getConnected());
                if(current.getBoard().getVertex(currentIndex).getConnected()){
                    startConnected = true; 
                    activeStart.add(current.getBoard().getVertex(currentIndex));
                }
                currentIndex = current.getVertexIndex(4,i);
                if(current.getBoard().getVertex(currentIndex).getConnected()){
                    endConnected = true; 
                    activeEnd.add(current.getBoard().getVertex(currentIndex));
                }
            }
        }

        if(current.getNum() == 2){
            for(int i = 0; i<4; i ++){
                currentIndex = current.getVertexIndex(i,0);
                if(current.getBoard().getVertex(currentIndex).getConnected()){
                    startConnected = true; 
                }
                currentIndex = current.getVertexIndex(i,4);
                if(current.getBoard().getVertex(currentIndex).getConnected()){
                    endConnected = true; 
                }
            }
        }
        return(startConnected&&endConnected);
    }

    public static void main(String[] args){
        BridgeItGame test = new BridgeItGame();

        int currentIndex = test.player1.getVertexIndex(0,0);
        int currentIndex2 = test.player1.getVertexIndex(0,1);
        int currentIndex3 = test.player1.getVertexIndex(4,0);
        int currentIndex4 = test.player1.getVertexIndex(4,1);

        System.out.println("currentIndex " +currentIndex);
        System.out.println("currentIndex2 " +currentIndex2);        
        test.player1.getBoard().addEdge(test.player1.getBoard().getVertex(currentIndex),test.player1.getBoard().getVertex(currentIndex2));
        test.player1.getBoard().addEdge(test.player1.getBoard().getVertex(currentIndex3),test.player1.getBoard().getVertex(currentIndex4));
        System.out.println(test.checkWinHelper(test.player1));

    }
}
