import javax.swing.*;
import java.awt.event.*;

public class RadioExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Gender Selection");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 80, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b = new JButton("Submit");
        b.setBounds(100, 120, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(100, 160, 150, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    result.setText("Male selected");
                } else if (r2.isSelected()) {
                    result.setText("Female selected");
                } else {
                    result.setText("No selection");
                }
            }
        });

        f.add(r1);
        f.add(r2);
        f.add(b);
        f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
