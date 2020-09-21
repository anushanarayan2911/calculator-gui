import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel1;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();

        frame.setTitle("Calculator");
        frame.setSize(500, 500);
        panel1.setSize(200, 200);

        panel1.setLayout(new GridLayout(4, 4));
        frame.add(panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void displayScreen() {
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonPlus = new JButton("+");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMinus = new JButton("-");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonMultiply = new JButton("x");
        JButton buttonPoint = new JButton(".");
        JButton button0 = new JButton("0");
        JButton buttonEquals = new JButton("=");
        JButton buttonDivide = new JButton("/");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(buttonPlus);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(buttonMinus);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(buttonMultiply);
        panel1.add(buttonPoint);
        panel1.add(button0);
        panel1.add(buttonEquals);
        panel1.add(buttonDivide);
        
        frame.setVisible(true);
    }
}
