import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

// This program is an example of using ActionListeners on a JButton

public class Main extends JFrame {
    private static JLabel label1;
    private static JLabel label2;

    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 640;
        final int FRAME_HEIGHT = 480;
        GridLayout glayout = new GridLayout(3,3);
        JFrame frame = new Main();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setTitle("Clicky GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(glayout);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        frame.add(panel);

        frame.setVisible(true);
    }
}
