import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String [] args){
        JFrame frame = new JFrame("Water Tower Simulation");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Water Tower");
        JPanel panel = new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}