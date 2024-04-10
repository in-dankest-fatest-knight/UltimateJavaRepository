package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class GradientIllusion extends JPanel {
    private static final int width = 256;
    private static final int height = 256;

    private static final double rectFractionX = 0.8;
    private static final double rectFractionY = 0.5;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = width - 1; x >= 0; x--) {
            g.setColor(new Color(x, x, x));
            g.drawLine(x, 0, x, height - 1);
            // g.fillRect(x, 0, 5, 256);
        }

        g.setColor(new Color(255 / 2, 255 / 2, 255 / 2));
        int rectWidth = (int) (width * rectFractionX);
        int rectHeight = (int) (height * rectFractionY);
        int xLeft = width - rectWidth;
        int yLeft = height - rectHeight;

        g.fillRect(xLeft / 2, yLeft / 2, rectWidth, rectHeight);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GradientIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(256, 256);
        frame.add(new GradientIllusion());
        frame.setVisible(true);
    }
}