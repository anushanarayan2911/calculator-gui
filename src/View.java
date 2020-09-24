import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel1;
    private JLabel sum;

    public JButton button1;
    public JButton button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonPoint, buttonEquals;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();

        frame.setTitle("Calculator");
        frame.setSize(500, 500);

        panel1.setSize(200, 200);
        panel1.setLayout(new GridLayout(4, 4));

        sum = new JLabel("");

        frame.add(panel1);
        frame.add(sum);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        buttonPlus = new JButton("+");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonMinus = new JButton("-");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonMultiply = new JButton("*");
        buttonPoint = new JButton(".");
        button0 = new JButton("0");
        buttonEquals = new JButton("=");
        buttonDivide = new JButton("/");
    }

    public void displayScreen() {
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

    public void displayAnswer(int i) {
        sum.setText(Integer.toString(i));
    }

}
