public class MeteorMove extends Thread {
    private PaintBg bg;
    private int posX, posY;

    MeteorMove(PaintBg bg, int x, int y) {
        this.bg = bg;
        this.posX = x;
        this.posY = y;
    }

    public void run() {

    }
}
