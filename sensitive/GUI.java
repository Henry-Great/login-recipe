import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI");
        JButton button = new JButton("Click Me!");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
