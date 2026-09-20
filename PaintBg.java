import java.awt.*;
import javax.swing.*;

public class PaintBg extends JLabel{

    int n;
    Image[] meteo = new Image[n];

    PaintBg() {
        setBackground(Color.BLACK);
        setOpaque(true);
        for (int i = 0; i < meteo.length; i++) {
            
        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}