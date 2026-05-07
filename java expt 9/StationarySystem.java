import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox cb1, cb2, cb3;
    JButton btn;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(300, 300);
        setLayout(new FlowLayout());

        cb1 = new JCheckBox("Notebook @ 50");
        cb2 = new JCheckBox("Pen @ 30");
        cb3 = new JCheckBox("Pencil @ 10");

        btn = new JButton("Order");
        btn.addActionListener(this);

        add(cb1);
        add(cb2);
        add(cb3);
        add(btn);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;

        if(cb1.isSelected()) {
            String q = JOptionPane.showInputDialog("Enter quantity for Notebook");
            int qty = Integer.parseInt(q);
            total += qty * 50;
        }

        if(cb2.isSelected()) {
            String q = JOptionPane.showInputDialog("Enter quantity for Pen");
            int qty = Integer.parseInt(q);
            total += qty * 30;
        }

        if(cb3.isSelected()) {
            String q = JOptionPane.showInputDialog("Enter quantity for Pencil");
            int qty = Integer.parseInt(q);
            total += qty * 10;
        }

        JOptionPane.showMessageDialog(this, "Total Amount: " + total);
        JOptionPane.showMessageDialog(this, "Successfully Ordered!");
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}
