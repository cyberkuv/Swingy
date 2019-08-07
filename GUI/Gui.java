package za.wethinkcode.swingy.GUI;

import java.awt.Button;
import java.awt.Frame;

public class Gui extends Frame {
    Gui() {
        Button newHero = new Button("New Hero");
        newHero.setBounds(30, 100, 80, 30);
        add(newHero);
        setSize(600, 800);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) { Gui gui = new Gui(); }
}