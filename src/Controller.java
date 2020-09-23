import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        this.view.button1.addActionListener(this);
        this.view.button2.addActionListener(this);
        this.view.button3.addActionListener(this);
        this.view.button4.addActionListener(this);
        this.view.button5.addActionListener(this);
        this.view.button6.addActionListener(this);
        this.view.button7.addActionListener(this);
        this.view.button8.addActionListener(this);
        this.view.button9.addActionListener(this);
        this.view.button0.addActionListener(this);
        this.view.buttonPoint.addActionListener(this);
        this.view.buttonPlus.addActionListener(this);
        this.view.buttonMinus.addActionListener(this);
        this.view.buttonMultiply.addActionListener(this);
        this.view.buttonDivide.addActionListener(this);
        this.view.buttonEquals.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        this.model.numbers(s);
    }
}
