import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel panel;

    public MainWindow() throws HeadlessException {

        panel = new DrawPanel(1920, 1080);
        this.add(panel);
    }
}
