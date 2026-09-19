import java.awt.*;
import javax.swing.*;

public class PaintBg extends JLabel{

    PaintBg() {
        setBackground(Color.BLACK);
        setOpaque(true);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}