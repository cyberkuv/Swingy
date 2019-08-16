package za.wethinkcode.swingy.HERO;

import java.util.Scanner;

import za.wethinkcode.swingy.READER.*;
import za.wethinkcode.swingy.WRITER.*;
import za.wethinkcode.swingy.GAME.*;

public class Hero {
    public static String name;
    public static String hClass;
    public static int lvl = 1;
    public static int lvlUp = lvl * 1000 + ((lvl - 1) * (lvl - 1)) * 450;
    public static int xp = 0;
    public static int hp = 60;
    public static void createHero(){
        Scanner newHero = new Scanner(System.in);
        System.out.println("\033[32;1m[ Hero class : Wizard  | Worrior  | Gun Slinger  | ranger  | archer ]\033[32;0m");
        System.out.print("\033[32;1m> class > \033[32;0m");
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
        System.out.print("\033[32;1m> Name > \033[32;0m");
        name = newHero.nextLine();
        System.out.println("\033[33;1m[New Hero Created!]\033[33;0m");
        Writer.getWriter().writetofile(name + ", " + hClass + ", " + lvl + ", " + xp + ", " + hp);
        System.out.println("\033[33;1m[Hero logged to Hero database]\033[33;0m");
        System.out.println("\033[33;1m> Possible actions : 1 = Launch Battle, 2 = Create New Hero.\033[33;0m");
        System.out.print("\033[32;1m> input > \033[32;0m");
        String other = newHero.nextLine();
        if(other.equals("1")) {
            System.out.println("\033[33;1mChoose to launch battle\033[33;0m");
            Launch.gameLaunch();
        } else if (other.equals("2")) {
            System.out.println("\033[32;1mChoose to create another Hero\033[32;0m");
            createHero();
        } else { System.out.println("\033[31;1munknown option\033[31;0m"); }
        newHero.close();
    }
    public static void chooseHero(){
        Scanner prevHero = new Scanner(System.in);
        System.out.print("\033[32;1m[Hero Name] >> \033[32;0m");
        String prev = prevHero.nextLine();
        if(prev.equalsIgnoreCase("rangex")) {
            System.out.println("\033[33;1m[Hero Stats!]\33[33;0m");
            Reader.ReadH();
        } else {
            System.out.println("\033[31;1m[Unknown Hero]\033[31;0m");
            chooseHero();
        }
        prevHero.close();
    }
}