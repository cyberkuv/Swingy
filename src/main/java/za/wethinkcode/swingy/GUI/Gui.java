package za.wethinkcode.swingy.GUI;

import java.awt.Color;
import java.awt.Font;
// import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Gui {
    JFrame frame = new JFrame("_SWINGY SWINGY_");
    JButton b1 = new JButton("New Hero");
    JButton b2 = new JButton("Prev Hero");
    JButton create = new JButton("-Create-");
    JButton use = new JButton("-Use-");
    JButton backBtn = new JButton("-Back-");

    JPanel panel = new JPanel();
    Border border = BorderFactory.createLineBorder(Color.GREEN);
    Gui() {
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLACK);

        NewHero();
        PrevHero();
        frame.setSize(700, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void NewHero() {
        b1.setForeground(Color.BLACK);
        b1.setBounds(250, 250, 150, 40);
        b1.setBackground(Color.GREEN);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setOpaque(true);
        b1.setFont(new Font("Arial", Font.BOLD, 20));

        b1.addActionListener(new ActionListener(){
            JButton notClickableText = new JButton("-Hero Creation-");
            @Override
            public void actionPerformed(ActionEvent e) {
                backBtn();

                notClickableText.setForeground(Color.GREEN);
                notClickableText.setBounds(200, 5, 300, 40);
                notClickableText.setBackground(Color.BLACK);
                notClickableText.setBorderPainted(false);
                notClickableText.setContentAreaFilled(false);
                notClickableText.setOpaque(true);
                notClickableText.setFont(new Font("Arial", Font.BOLD, 30));

                displayBox();
                create();
                frame.getContentPane().removeAll();
                frame.getContentPane().add(notClickableText);
                frame.getContentPane().add(panel);
                frame.getContentPane().add(create);
                frame.getContentPane().add(backBtn);
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.add(b1);
    }

    public void backBtn() {
        backBtn.setForeground(Color.BLACK);
        backBtn.setBounds(22, 5, 120, 40);
        backBtn.setBackground(Color.GREEN);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setOpaque(true);
        backBtn.setFont(new Font("Arial", Font.BOLD, 20));

        backBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(b1);
                frame.getContentPane().add(b2);
                frame.revalidate();
                frame.repaint();
            }
        });
    }

    public void displayBox() {
        panel.setBounds(25, 60, 650, 600);
        panel.setBorder(border);
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.GREEN);
    }

    public void create() {
        create.setForeground(Color.BLACK);
        create.setBounds(250, 690, 200, 40);
        create.setBackground(Color.GREEN);
        create.setBorderPainted(false);
        create.setContentAreaFilled(false);
        create.setOpaque(true);
        create.setFont(new Font("Arial", Font.BOLD, 30));

        create.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void PrevHero() {
        b2.setForeground(Color.BLACK);
        b2.setBounds(250, 450, 150, 40);
        b2.setBackground(Color.GREEN);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setOpaque(true);
        b2.setFont(new Font("Arial", Font.BOLD, 20));

        b2.addActionListener(new ActionListener(){
            JButton notClickableText = new JButton("-Use Prev Hero-");
            @Override
            public void actionPerformed(ActionEvent e) {
                notClickableText.setForeground(Color.GREEN);
                notClickableText.setBounds(200, 5, 300, 40);
                notClickableText.setBackground(Color.BLACK);
                notClickableText.setBorderPainted(false);
                notClickableText.setContentAreaFilled(false);
                notClickableText.setOpaque(true);
                notClickableText.setFont(new Font("Arial", Font.BOLD, 30));

                displayBox();
                JTextArea text = new JTextArea("Hero Stats");
                panel.add(text);
                use();

                frame.getContentPane().removeAll();
                frame.getContentPane().add(notClickableText);
                frame.getContentPane().add(backBtn);
                frame.getContentPane().add(panel);
                frame.getContentPane().add(use);
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.add(b2);
    }
    public void use() {
        use.setForeground(Color.BLACK);
        use.setBounds(250, 690, 200, 40);
        use.setBackground(Color.GREEN);
        use.setBorderPainted(false);
        use.setContentAreaFilled(false);
        use.setOpaque(true);
        use.setFont(new Font("Arial", Font.BOLD, 30));

        use.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    public static void main(String[] args) { new Gui(); }
}