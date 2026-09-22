import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PaintBg extends JLabel {

    private Display display;
    private int n;
    private Image bg;
    private Image[] meteor;
    private int[] posX;
    private int[] posY;
    private Image bomb;
    private JFrame frameCount = new JFrame();

    public boolean isReady = false;

    PaintBg(Display display) {
        this.display = display;
        JLabel lblCount = new JLabel("Meteor Count:");
        JTextField tfCount = new JTextField(25);
        JButton btnApply = new JButton("Apply");
        frameCount.setSize(400, 150);
        frameCount.setLayout(new FlowLayout());
        frameCount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frameCount.add(lblCount);
        frameCount.add(tfCount);
        frameCount.add(btnApply);

        frameCount.setVisible(!isReady);
        btnApply.addActionListener(e -> {
            try {
                n = Integer.parseInt(tfCount.getText());
            } catch (Exception er) {
                return;
            }
            meteor = new Image[n];
            posX = new int[n];
            posY = new int[n];

            for (int i = 0; i < n; i++) {
                posX[i] = new Random().nextInt(0, 500);
                posY[i] = new Random().nextInt(0, 500);
            }

            loadMeteor();
            loadBomb();
            isReady = !isReady;

            frameCount.setVisible(!isReady);
            display.setVisible(isReady);
        });

        setOpaque(true);
        bg = new ImageIcon(getClass().getResource("/Image/background.png")).getImage();
    }

    public void loadMeteor() {
        
        for (int i = 0; i < meteor.length; i++) {
            String path = "/Image/meteor" + new Random().nextInt(1, 5) + ".png";
            meteor[i] = new ImageIcon(getClass().getResource(path)).getImage();
        }
    }

    public void loadBomb() {
        bomb = new ImageIcon(getClass().getResource("/Image/boom.png")).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        g.drawImage(bg, 0, 0, 600, 600, this);

        for (int i = 0; i < meteor.length; i++) {
            g.drawImage(meteor[i], posX[i], posY[i], 75, 75, this);
        }

    }
}