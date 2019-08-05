package za.wethinkcode.swingy;

import java.util.Scanner;

import za.wethinkcode.swingy.hero.Hero;

public class App {
    public static void main( String[] args ) {
        Scanner choice = new Scanner(System.in);
        if(args.length == 1) {
            if(args[0].equals("gui")) {
                System.out.println("\033[31;1m[Gui still under construction!]\033[31;0m");
            } else if (args[0].equals("console")) {
                System.out.println("\t\t\033[32;1m[Welcome Sir/Madam]\033[32;0m");
                System.out.println("\t\t\033[32;1m  [-SWING SWING-]\033[32;0m");
                System.out.println("\033[32;1m[Possible options : 1 = Create a hero, 2 = use privious Hero]\033[32;0m");
                System.out.print("\033[33;1m> input > \033[33;0m");
                String first = choice.nextLine();
                if(first.equals("1")) {
                    System.out.println("\033[33;1m[Hero Stats!]\33[33;0m");
                    Hero.createHero();
                } else if(first.equals("2")) {
                    System.out.println("\033[33;1m[Choose to use a privious hero.]\033[33;0m");
                    Hero.chooseHero();
                } else {
                    System.out.println("\033[31;1m> Unknown Option\033[31;0m");
                }
            } else {
                System.out.println("\033[31;1m[You have to pass an argument of either gui or console.]\033[31;0m");
            }
        } else {
            System.out.println("\033[31;1m[takes in one arguement]\033[31;0m");
        }
        choice.close();
    }
}