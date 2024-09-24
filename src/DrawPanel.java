import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private int ticksFromStart = 0;

    
    private Background background;
    private Star star;
    private Planet planet;
    private Tree tree;
    private Orbits orbits;

    public DrawPanel(final int width, final int height) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        int red = 60 + (int)(Math.random() * 90);
        int green = 60 + (int)(Math.random() * 90);
        int blue = 60 + (int)(Math.random() * 90);

        Color cback1 = new Color(red, green, blue);
        Color cback2 = new Color(green, blue, red);
//        Color cback2 = Color.BLACK;
        Color cStars = new Color(150 + (int)(Math.random() * 90), 150 + (int)(Math.random() * 90), 150 + (int)(Math.random() * 90));
        this.background = new Background((int)(Math.random()*PANEL_WIDTH), (int)(Math.random()*PANEL_WIDTH), cback1, cback2);
        this.star = new Star(12 + (int)(Math.random() * 10), cStars);



        int sizeOfPlanet = 450 + (int)(Math.random() * 300);
        this.orbits = new Orbits(sizeOfPlanet);
        red = 40 + (int)(Math.random() * 160);
        green = 40 + (int)(Math.random() * 160);
        blue = 40 + (int)(Math.random() * 160);

        Color cPlanet = new Color(red, green, blue);
        Color cPlanet2 = new Color(red + 9, green + 9, blue + 9, 200);

        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);
        Color treeSide = new Color(red, green, blue);

        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);
        Color treeMain = new Color(red, green, blue);

        this.planet = new Planet(sizeOfPlanet, cPlanet, cPlanet2);
        this.tree = new Tree(sizeOfPlanet, treeMain, treeSide);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);


        //задний фон

        background.draw(gr, PANEL_WIDTH, PANEL_HEIGHT);

        //генерация звезд

        int countOfStars = 10 + (int) (Math.random() * 20);
        System.out.println(countOfStars);
        int typeOfStars = (int) (Math.random() * 3);
        if (typeOfStars == 0) {
            for (int i = 0; i < countOfStars; i++) {
                star.draw1(gr, (int) (Math.random() * PANEL_WIDTH), (int) (Math.random() * PANEL_HEIGHT));
            }
        } else if (typeOfStars == 1) {
            for (int i = 0; i < countOfStars; i++) {
                star.draw2(gr, (int) (Math.random() * PANEL_WIDTH), (int) (Math.random() * PANEL_HEIGHT));
            }
        } else {
            for (int i = 0; i < countOfStars; i++) {
                star.draw3(gr, (int) (Math.random() * PANEL_WIDTH), (int) (Math.random() * PANEL_HEIGHT));
            }
        }

        // планета

        planet.draw(gr, PANEL_WIDTH, PANEL_HEIGHT);


        //дерево

        tree.draw(gr, PANEL_WIDTH/2, PANEL_HEIGHT/2);


        orbits.draw(gr, PANEL_WIDTH/2, PANEL_HEIGHT/2);
    }

}