import java.awt.*;

public class Tree {
    private int sizePlanet;
    private Color mainColor;
    private Color sideColor;

    public Tree(int size, Color mainColor, Color sideColor) {
        this.sizePlanet = size;
        this.mainColor = mainColor;
        this.sideColor = sideColor;
    }

    void draw(final Graphics gr, int x, int y) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(sideColor);
        int pov = y - sizePlanet / 2 - 8;

        int rot = (int) (Math.random() * 360);
        g.rotate(Math.toRadians(rot), x, y);

        g.fillRect(x - 10, pov - 50, 16, 70);



        g.setColor(mainColor);
        int[] arr1 = {x - 20, x - 10, x - 20, x - 10, x - 20, x, x + 20, x + 10, x + 20, x + 10, x + 20};
        int[] arr2 = {pov, pov - 20, pov - 20, pov - 40, pov - 40, pov - 80, pov - 40, pov - 40, pov - 20, pov - 20, pov};
        g.fillPolygon(arr1, arr2, 11);

        g.rotate(Math.toRadians(-rot), x, y);


    }
}