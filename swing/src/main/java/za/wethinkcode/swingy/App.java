package za.wethinkcode.swingy;

import java.util.Scanner;

import za.wethinkcode.swingy.hero.Hero;

public class App {
    public static void main( String[] args ) {
        if(args.length == 1) {
            if(args[0].equals("gui")) {
                System.out.println("\033[31;1m|=====[Gui still under construction!]=====|\033[31;0m");
            } else if (args[0].equals("console")) {
                System.out.println("\033[33;1m|=======================================|\033[33;0m");
                System.out.println("\033[32;1m|==========[Welcome Sir/Madam]==========|\033[32;0m");
                System.out.println("\033[33;1m|=======================================|\033[33;0m");
                System.out.println("\033[32;1m|==============[-SWINGY-]===============|\033[32;0m");
                System.out.println("\033[33;1m|=======================================|\033[33;0m");
                System.out.println("\033[32;1m|=======[Create a hero : Enter 1]=======|\033[32;0m");
                  System.out.println("\033[32;1m|=====[use privious hero : Enter 2]=====|\033[32;0m");

                Scanner choice = new Scanner(System.in);
                System.out.print("\033[33;1m|=====[What will it be >> \033[33;0m");
                String choice1 = choice.nextLine();
                if(choice1.equals("1")){
                    System.out.println("\033[33;1m|======[Hero Stats!]======|\33[33;0m");
                    Hero.createHero();
                } else if(choice1.equals("2")){
                    System.out.println("\033[33;1m|====Choose to use a privious hero.]====|\033[33;0m");
                    Hero.chooseHero();
                } else {
                    System.out.println("\033[31;1m|=====[unknown value!]=====|\033[31;0m");
                }
                choice.close();
            } else { System.out.println("\033[31;1m|=====[unknown mode!]=====|\033[31;0m"); }
        } else {
            System.out.println("\033[31;1m|=====[You have to pass an argument of either gui or console.]=====|\033[31;0m");
        }
    }
}