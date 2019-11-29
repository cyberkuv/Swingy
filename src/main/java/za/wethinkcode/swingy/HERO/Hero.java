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
    public static int x = 0;
    public static int y = 0;
    public static void createHero(){
        Scanner newHero = new Scanner(System.in);
        System.out.println("\033[32;1m[-\033[33;1mHero class : 1 = Wizard | 2 = goblin | 3 = knight | 4 = cyborg | 5 = archer\033[32;1m-]\033[32;0m");
        System.out.print("\033[32;1m[-class->] \033[32;0m");
        String str = newHero.nextLine();
        if(str.equalsIgnoreCase("1")){
            hClass = "wizard";
        } else if (str.equalsIgnoreCase("2")) {
            hClass = "goblin";
        } else if (str.equalsIgnoreCase("3")) {
            hClass = "knight";
        } else if (str.equalsIgnoreCase("4")) {
            hClass = "cyborg";
        } else if (str.equalsIgnoreCase("5")) {
            hClass = "archer";
        } else {
            System.out.println("\033[31;1m[-Unknown class-]\033[31;0m");
            createHero();
        }
        System.out.print("\033[32;1m[-Name->] \033[32;0m");
        name = newHero.nextLine();
        Writer.getWriter().writetofile(name + ", " + hClass + ", " + lvl + ", " + xp + ", " + hp);

        System.out.println("\033[33;1m[-New Hero : Name - " + name + ", Class - " + hClass + ", Created-]\033[33;0m");
        System.out.println("\033[32;1m[----------------\033[33;1mOptions : 1 to Launch Batt | 2 to Create New H\033[32;1m---------------]\033[32;0m");
        System.out.print("\033[32;1m[-input->] \033[32;0m");
        String other = newHero.nextLine();
        if(other.equals("1")) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
            System.out.println("\033[32;1m[-----------------------------\033[33;1mLet The Games Begin\033[32;1m-----------------------------]\033[32;0m");
            System.out.println("\033[32;1m[--------------------------------\033[33;1mSWING SWING\033[32;1m----------------------------------]\033[32;0m");
            System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
            Launch.genMap(x, y);
            Launch.player(Launch.hero, x, y);
        } else if (other.equals("2")) {
            createHero();
        } else { System.out.println("\033[31;1m[-Unknown Option-]\033[31;0m"); }
        newHero.close();
    }
    public static void chooseHero(){
        Scanner prevHero = new Scanner(System.in);
        System.out.print("\033[32;1m[-Hero Name->] \033[32;0m");
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