package za.wethinkcode.swingy;

import za.wethinkcode.swingy.GUI.*;
import za.wethinkcode.swingy.HERO.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        if (args.length == 1) {
            if (args[0].equals("gui")) {
                System.out.println("\033[31;1m[Testing Gui!]\033[31;0m");
                Gui.main(args);
            } else if (args[0].equals("console")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
                System.out.println("\033[32;1m[-----------------------------\033[33;1mWelcome Sir/Madam\033[32;1m-------------------------------]\033[32;0m");
                System.out.println("\033[32;1m[--------------------------------\033[33;1mSWING SWING\033[32;1m----------------------------------]\033[32;0m");
                System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
                System.out.println("\033[32;1m[---------------\033[33;1mOptions : 1 to Create new | 2 to Use Existing\033[32;1m-----------------]\033[32;0m");
                System.out.print("\033[33;1m[-input->] \033[33;0m");
                String first = choice.nextLine();
                if (first.equals("1")) {
                    System.out.println("\033[32;1m[--------------------------------\033[33;1mCreate New\033[32;1m-----------------------------------]\033[32;0m");
                    Hero.createHero();
                } else if (first.equals("2")) {
                    System.out.println("\033[32;1m[---------------------------------\033[33;1mChoose Existing\033[32;1m---------------------------------]\033[32;0m");
                    Hero.chooseHero();
                } else {
                    System.out.println("\033[31;1m[-Unknown Option-]\033[31;0m");
                }
            } else {
                System.out.println("\033[31;1m[-Argument : gui or console-]\033[31;0m");
            }
        } else {
            System.out.println("\033[31;1m[-Takes one arguement-]\033[31;0m");
        }
        choice.close();
    }
}