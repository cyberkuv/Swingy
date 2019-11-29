package com.wethinkcode.swingy;

import com.wethinkcode.swingy.controller.*;
@interface Main {}
@Main
public class App {
    public static void main(String args[]) {
        if (args.length == 1) {
            if (args[0].equals("gui")) {
                System.out.println("\033[31;1m[Testing Gui!]\033[31;0m");
                // Gui.main(args);
            } else if (args[0].equals("console")) {
                game game = new game();

                while (true)
                    game.menu();
            } else {
                System.out.println("\033[31;1m[-Argument : gui or console-]\033[31;0m");
            }
        } else {
            System.out.println("\033[31;1m[-Takes one arguement-]\033[31;0m");
        }
    }
}
