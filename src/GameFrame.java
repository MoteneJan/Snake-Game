import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame()
    {
        //GamePanel panel = new GamePanel();
        this.add(new GamePanel());
        this.setTitle("MOTENE JO  -SNAKE_GAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
