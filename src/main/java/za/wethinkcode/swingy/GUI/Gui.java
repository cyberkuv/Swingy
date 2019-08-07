package za.wethinkcode.swingy.GUI;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui {
    JFrame f = new JFrame("_SWINGY SWINGY_");
    Gui() {
        JButton b1 = new JButton("New Hero");
        JButton b2 = new JButton("Prev Hero");
        f.setBackground(Color.BLACK);
        f.getContentPane().setBackground(Color.BLACK);

        b1.setBounds(250, 250, 150, 40);
        b1.setBackground(Color.GRAY);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setOpaque(true);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                NewHero();
            }
        });

        b2.setBounds(250, 450, 150, 40);
        b2.setBackground(Color.GRAY);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setOpaque(true);

        f.add(b1);
        f.add(b2);
        f.setSize(700, 800);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void NewHero() {
        Panel panel = new Panel();
        panel.setBackground(Color.GRAY);
        f.add(panel);
    }
    public static void main(String[] args) { new Gui(); }
}