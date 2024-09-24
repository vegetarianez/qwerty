import java.awt.*;

public class Orbits {
    private int sizeOfPlanet;

    public Orbits(int sizeOfPlanet) {
        this.sizeOfPlanet = sizeOfPlanet;
    }

    void draw(final Graphics gr, int x, int y) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.BLACK);
        int rot = (int) (Math.random() * 360);
        g.rotate(Math.toRadians(rot), x, y);
        g.drawArc(x - sizeOfPlanet/2 - 50, (int) (y - 20 + Math.random() * 40), sizeOfPlanet + 100, (int) (20 + Math.random() * 200)  , 150, 240);
        g.rotate(Math.toRadians(rot), x, y);

        rot = (int) (Math.random() * 360);
        g.rotate(Math.toRadians(rot), x, y);
        g.drawArc(x - sizeOfPlanet/2 - 50, (int) (y - 20 + Math.random() * 40), sizeOfPlanet + 100, (int) (20 + Math.random() * 200)  , 150, 240);
        g.rotate(Math.toRadians(rot), x, y);
        
        rot = (int) (Math.random() * 360);
        g.rotate(Math.toRadians(rot), x, y);
        g.drawArc(x - sizeOfPlanet/2 - 50, (int) (y - 20 + Math.random() * 40), sizeOfPlanet + 100, (int) (20 + Math.random() * 200)  , 150, 240);
        g.rotate(Math.toRadians(rot), x, y);
    }
}
