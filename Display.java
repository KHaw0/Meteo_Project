import javax.swing.*;

public class Display extends JFrame{

    Display() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
    }

    public static void main(String[] args) {
        Display display = new Display();
        PaintBg paint = new PaintBg();

        paint.setBounds(0, 0, 500, 500);
        
        display.add(paint);
        display.setVisible(true);
    }
}