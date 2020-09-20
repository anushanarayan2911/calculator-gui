import javax.swing.*;

public class View {

    private JFrame frame;
    private JPanel panel;

    public View() {
        frame = new JFrame();
        panel = new JPanel();

        frame.setTitle("Calculator");
        frame.setSize(500, 500);
        panel.setSize(500, 500);

        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
