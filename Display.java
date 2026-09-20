import javax.swing.*;

public class Display extends JFrame{    

    Display() {
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }

    public static void main(String[] args) {
        Display display = new Display();
        PaintBg paint = new PaintBg(display);

        paint.setBounds(0, 0, 600, 600);
        
        display.add(paint);
    }
}