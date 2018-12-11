import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers
import javax.swing.event.*;
/**
 * Write a description of class StartPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StartPanel extends JPanel {

    Image image;
    BridgeItGame game;

    // private Image img;
    // JLabel L1 = new JLabel ("Bridge It");
    JButton b1 = new JButton("START");
    JTextField player1Name = new JTextField("Player1");
    JTextField player2Name = new JTextField("Player2");    
    // JLabel thumb = new JLabel();

    // public StartPanel() {
    // this(new ImageIcon(img).getImage());
    // thumb.setIcon(icon);
    // thumb.add(B1);
    // add(thumb);

    // }'   Image image;
    public StartPanel(Image image, BridgeItGame myGame){
        setLayout(new BorderLayout());
        b1.setSize(60,30);
        game = myGame;
        this.image = image;
        b1.addActionListener(new ButtonListener());
        add (b1, BorderLayout.SOUTH);
        add (player1Name, BorderLayout.SOUTH);     
        add (player2Name, BorderLayout.SOUTH);        
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            add(new BoardPanel(game));
            removeAll();
        }
    }

    @Override   
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0,0, this);

    }
}
