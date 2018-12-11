import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
import javax.swing.event.*;
/**
 * Write a description of class boardPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class BoardPanel extends JPanel
{
    /**
     * Constructor for objects of class boardPanel
     */
    public BoardPanel(BridgeItGame myGame)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Color player1 = new Color(0,191,255);//blue
        Color player2 = new Color(192,192,192); //grey
        Image rock = toolkit.getImage("rock2.png"); 
        //width and height are uniform for all vertices
        int width = myGame.getPlayer1().getBoard().getVertex(1).getWidth();
        int height = myGame.getPlayer1().getBoard().getVertex(1).getHeight();
        
        JPanel canvas = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);     // paint parent's background
                    //g.drawImage(river, 0,0, this);
                    setBackground(Color.WHITE);  // set background color for this JPanel
                    g.setColor(player1);    // set the drawing color

                    for(int i = 0; i<20; i++){
                        g.drawOval(myGame.getPlayer1().getBoard().getVertex(i).getXpos(), myGame.getPlayer1().getBoard().getVertex(i).getYpos(),
                        width, height);
                        g.fillOval(myGame.getPlayer1().getBoard().getVertex(i).getXpos(), myGame.getPlayer1().getBoard().getVertex(i).getYpos(),
                        width, height);
                    }
                    
                    g.setColor(player2); 
                    
                    for(int i = 0; i<20; i++){
                        g.drawOval(myGame.getPlayer2().getBoard().getVertex(i).getXpos(), myGame.getPlayer2().getBoard().getVertex(i).getYpos(),
                        width, height);
                        g.fillOval(myGame.getPlayer2().getBoard().getVertex(i).getXpos(), myGame.getPlayer2().getBoard().getVertex(i).getYpos(),
                        width, height);
                    }
                }     
            };
            
        canvas.setPreferredSize(new Dimension(1300, 800));

        System.out.println("reached");
        canvas.addMouseListener(new myMouseListener());
        add(canvas);
    }
    

    
        private class myMouseListener implements MouseListener
    {  
        public void mouseClicked(MouseEvent event)
        {  
            System.out.println("Mouse clicked @ position x = "
                + event.getX() + " y = " + event.getY());   
            //add an edge in the clicked area 
        }

        public void mouseEntered(MouseEvent event)
        {  
            //do nothing
        }

        public void mouseExited(MouseEvent event)
        { 
            //do nothing
        }

        public void mousePressed(MouseEvent event)
        {  System.out.println("Mouse pressed. x = " 
                + event.getX() + " y = " + event.getY());
        }

        public void mouseReleased(MouseEvent event)
        {  System.out.println("Mouse released. x = " 
                + event.getX() + " y = " + event.getY());
        }
    }

}
