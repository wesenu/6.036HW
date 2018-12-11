import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
import javax.swing.event.*;
/**
 * Write a description of class GUIDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUIDemo
{

    public static void main (String[] args)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image background = toolkit.getImage("download.png"); 
        JFrame frame = new JFrame ("Layout Manager Demo");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        BridgeItGame myGame = new BridgeItGame();

        frame.getContentPane().add(new StartPanel(background, myGame));

        frame.pack();
        frame.setVisible(true);
    }

}
