import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t;
    double num1, num2, result;
    char op;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        t = new JTextField();
        t.setFont(new Font("Arial", Font.BOLD, 20));
        add(t, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        String buttons[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+",
            "√","x²","%"
        };

        for(String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            p.add(btn);
        }

        add(p);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(s.matches("[0-9]")) {
            t.setText(t.getText() + s);
        }
        else if(s.equals("C")) {
            t.setText("");
        }
        else if(s.equals("=")) {
            num2 = Double.parseDouble(t.getText());

            switch(op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1 % num2; break;
            }

            t.setText("" + result);
        }
        else if(s.equals("√")) {
            double x = Double.parseDouble(t.getText());
            t.setText("" + Math.sqrt(x));
        }
        else if(s.equals("x²")) {
            double x = Double.parseDouble(t.getText());
            t.setText("" + (x * x));
        }
        else {
            num1 = Double.parseDouble(t.getText());
            op = s.charAt(0);
            t.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}