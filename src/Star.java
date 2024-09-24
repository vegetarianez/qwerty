import java.awt.*;

public class Star {
    private int size;
    private Color color;

    public Star(int size, Color color) {
        this.size = size;
        this.color = color;
    }
    void draw1(final Graphics gr, int x, int y) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
    void draw2(final Graphics gr, int x, int y) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);
        int[] arr1 = {x + size, x + size / 4, x, x - size / 4, x - size, x - size / 4, x, x + size / 4};
        int[] arr2 = {y, y + size / 4, y + size, y + size / 4, y, y - size / 4, y - size, y - size / 4};
        g.fillPolygon(arr1, arr2, 8);
    }
    void draw3(final Graphics gr, int x, int y) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);
        int rot = (int) (Math.random() * 90);
        g.rotate(Math.toRadians(rot), x, y);
        g.fillRect(x, y, size, size);
        g.rotate(Math.toRadians(-rot), x, y);
    }
}
