import javax.swing.*;
import java.awt.*;

class ShapesPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.drawRect(50, 50, 100, 50);

        // Draw an ellipse
        g.drawOval(200, 50, 100, 50);

        // Draw a line
        g.drawLine(400, 75, 500, 75);
    }
}

public class DrawShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        ShapesPanel shapesPanel = new ShapesPanel();
        frame.add(shapesPanel);

        frame.setVisible(true);
    }
}
 
    

