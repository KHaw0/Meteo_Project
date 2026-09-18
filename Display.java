import java.awt.Color;

import javax.swing.*;

public class Display extends JFrame{

    Display() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.BLACK);
        
    }

    public static void main(String[] args) {
        Display display = new Display();
        
        display.setVisible(true);
    }
}