import javax.swing.*;
import java.awt.event.*;

public class ReverseNumber {
    public static void main(String[] args) {

        JFrame f = new JFrame("Reverse Number");

        JLabel l = new JLabel("Enter Number:");
        l.setBounds(30, 30, 100, 30);

        JTextField tf = new JTextField();
        tf.setBounds(140, 30, 100, 30);

        JButton b = new JButton("Reverse");
        b.setBounds(80, 80, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(30, 120, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(tf.getText());
                int rev = 0;

                while (num != 0) {
                    rev = rev * 10 + num % 10;
                    num = num / 10;
                }

                result.setText("Reverse: " + rev);
            }
        });

        f.add(l);
        f.add(tf);
        f.add(b);
        f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
