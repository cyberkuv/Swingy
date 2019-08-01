package za.wethinkcode.swingy.hero;

import java.util.Scanner;

import za.wethinkcode.swingy.HeroReader;
import za.wethinkcode.swingy.WriteFile;

public class Hero {
    public static String name;
    private static String hClass;
    private static int lvl = 0;
    private static int exp = 0;
    private static int hp = 0;
    public static void createHero(){
        Scanner newHero = new Scanner(System.in);
        System.out.println("\033[32;1m[ Hero class : Wizard  | Worrior  | Gun Slinger  | ranger  | archer ]\033[32;0m");
        System.out.print("\033[32;1m[Your class] >> \033[32;0m");
        hClass = newHero.nextLine();
        if(hClass.equalsIgnoreCase("wizard")){
            System.out.println("\033[33;1m[Choose a wizard.]\033[33;0m");
        } else if (hClass.equalsIgnoreCase("warrior")) {
            System.out.println("\033[33;1m[Choose a warrior.]\033[33;0m");
        } else if (hClass.equalsIgnoreCase("Gun Slinger")) {
            System.out.println("\033[33;1m[Choose a Gun Slinger.]\033[33;0m");
        } else if (hClass.equalsIgnoreCase("ranger")) {
            System.out.println("\033[33;1m[Choose a ranger.]\033[33;0m");
        } else if (hClass.equalsIgnoreCase("archer")) {
            System.out.println("\033[33;1m[Choose an archer.]\033[33;0m");
        } else {
            System.out.println("\033[31;1m[unknown class!]\033[31;0m");
            createHero();
        }
        System.out.print("\033[32;1m[Your Name] >> \033[32;0m");
        name = newHero.nextLine();
        System.out.println("\033[33;1m[New Hero Created!]\033[33;0m");
        WriteFile.getwritefile().writetofile(name + ", " + hClass + ", " + lvl + ", " + exp + ", " + hp);
        System.out.println("\033[33;1m[Hero logged to Hero database]\033[33;0m");
        newHero.close();
    }
    public static void chooseHero(){
        Scanner prevHero = new Scanner(System.in);
        System.out.print("\033[32;1m[Hero Name] >> \033[32;0m");
        String prev = prevHero.nextLine();
        if(prev.equalsIgnoreCase("rangex")) {
            System.out.println("\033[33;1m[Hero Stats!]\33[33;0m");
            HeroReader.ReadH();
        } else {
            System.out.println("\033[31;1m[Unknown Hero]\033[31;0m");
            chooseHero();
        }
        prevHero.close();
    }
}