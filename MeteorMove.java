public class MeteorMove extends Thread {
    private PaintBg bg;
    private int id;
    private int speed;

    public MeteorMove(PaintBg bg, int id) {
        this.bg = bg;
        this.id = id;
    }

    public void run() {
    }
}
