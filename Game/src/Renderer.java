import java.awt.Graphics;
import javax.swing.JPanel;
public class Renderer extends JPanel{
    private static final long serialVersionUID = 1L;
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        FlappyBird.flappyBird.paint(graphics);
    }
}
