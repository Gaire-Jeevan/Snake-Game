import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame() {

        this.add(new GamePanel()); // instance of GamePanel
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true); // make the frame visible
        this.setLocationRelativeTo(null); // appear panel in middle of computer screen
    }
}