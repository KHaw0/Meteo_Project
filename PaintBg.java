import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PaintBg extends JLabel {

    private Display display;
    private int n;
    private Image bg;
    private Image[] meteor;
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
            loadMeteor();
            isReady = !isReady;

            frameCount.setVisible(!isReady);
            display.setVisible(isReady);
        });

        setOpaque(true);
        bg = new ImageIcon(getClass().getResource("/Image/background.png")).getImage();
    }

    public void loadMeteor(){
        int count = 0;
        for (int i = 0; i < meteor.length; i++) {
            String path = "";
            count++;
            if (count == 1)
                path = "/Image/meteor1.png";
            else if (count == 2)
                path = "/Image/meteor2.png";
            else {
                path = "/Image/meteor3.png";
                count = 0;
            }
            meteor[i] = new ImageIcon(getClass().getResource(path)).getImage();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        g.drawImage(bg, 0, 0, 600, 600, this);

        for (int i = 0; i < meteor.length; i++) {
            g.drawImage(meteor[i], new Random().nextInt(0, 500), new Random().nextInt(0, 500), 75, 75, this);
        }
    }
}