import javax.swing.*;
/**
 * Write a description of class GameGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameGui
{
public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Layout Manager Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      BridgeItGame myGame = new BridgeItGame();
      
      frame.getContentPane().add(new BoardPanel(myGame));

      frame.pack();
      frame.setVisible(true);
   }
}
