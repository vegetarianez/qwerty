import java.awt.*;

public class Planet {
    private int size;
    private Color mainColor;
    private Color sideColor;

    public Planet(int size, Color mainColor, Color sideColor) {
        this.size = size;
        this.mainColor = mainColor;
        this.sideColor = sideColor;
    }

    void draw(final Graphics gr, int wight, int height){
        gr.setColor(mainColor);
        gr.fillOval(wight / 2 - size / 2, height / 2 - size / 2, size, size);
        gr.setColor(sideColor);
        gr.fillOval((int) (wight / 2 - size / 2.2), (int) (height / 2 - size / 2.2), (int) (size / 1.1), (int) (size / 1.1));
        gr.setColor(mainColor);
        gr.fillOval((int) (wight / 2 - size / 2.4), (int) (height / 2 - size / 2.4), (int) (size / 1.2), (int) (size / 1.2));
        gr.setColor(sideColor);
        gr.fillOval((int) (wight / 2 - size / 2.6), (int) (height / 2 - size / 2.6), (int) (size / 1.3), (int) (size / 1.3));
        gr.setColor(mainColor);
        gr.fillOval((int) (wight / 2 - size / 2.8), (int) (height / 2 - size / 2.8), (int) (size / 1.4), (int) (size / 1.4));
    }
}
