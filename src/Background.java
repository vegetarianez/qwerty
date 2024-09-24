import java.awt.*;

public class Background {
    private Color color1;
    private Color color2;
    private int coord1;
    private int coord2;

    public Background(int coord2, int coord1, Color color2, Color color1) {
        this.coord2 = coord2;
        this.coord1 = coord1;
        this.color2 = color2;
        this.color1 = color1;
    }

    void draw(final Graphics gr, int wight, int height){
        Graphics2D g = (Graphics2D) gr;
        GradientPaint gp = new GradientPaint(coord1, 0, color1, coord2, height, color2);
        g.setPaint(gp);
        g.fillRect(0, 0, wight, height);
    }
}
