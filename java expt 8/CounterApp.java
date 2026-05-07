import java.awt.*;
import java.awt.event.*;

public class CounterApp extends Frame implements ActionListener {

    TextField tf;
    Button up, down, reset;
    int count = 0;

    CounterApp() {
        setLayout(new FlowLayout());

        add(new Label("Counter"));
        tf = new TextField("0", 10);
        add(tf);

        up = new Button("Count Up");
        down = new Button("Count Down");
        reset = new Button("Reset");

        add(up);
        add(down);
        add(reset);

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);

        setSize(350, 150);
        setTitle("Counter");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up) {
            count++;
        } else if (e.getSource() == down) {
            count--;
        } else if (e.getSource() == reset) {
            count = 0;
        }
        tf.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}