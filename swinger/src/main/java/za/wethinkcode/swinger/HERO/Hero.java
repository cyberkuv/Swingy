package za.wethinkcode.swinger.HERO;

import java.util.Scanner;

import za.wethinkcode.swinger.OPTIONS.Options;
import za.wethinkcode.swinger.RW.Writer;

public class Hero
{
    static Scanner sc = new Scanner(System.in);
    public static String name;
    public static String HClass;
    public static int lvl = 7;
    public static int exp = 0;
    public static int atk = 12;
    public static int def = 10;
    public static int hp = 30;
    public static int x;
    public static int y;

    public static void create() {
        System.out.println("> Hero Classes : 1 = Wizard, 2 = Archer, 3 = knight, 4 = Cyborg.");
        System.out.print("> Input : ");
        String create = sc.nextLine();
        if(create.equals("1")) {
            HClass = "Wizard";
        }
        else if(create.equals("2")) {
            HClass = "Archer";
        } else if(create.equals("3")) {
            HClass = "Knight";
        } else if(create.equals("4")) {
            HClass = "Cyborg";
        } else {
            System.out.println("> Unknown Option...");
        }
        System.out.print("> Enter Name : ");
        name = sc.nextLine();
        System.out.println("> Hero Created : " + name + " as a " + HClass);
        Writer.getWriter().writetofile(name + ", " + HClass + ", " + lvl + ", " + exp + ", " + atk + ", " + def + ", " + hp);
        System.out.println("> Hero Logged To Hero Database!");
        Options.lun_option();
    }

    public void stats(){
        System.out.println("Hero name:  " + name);
        System.out.println("Class:      " + HClass);
        System.out.println("Level:      " + lvl);
        System.out.println("Attack:     " + atk);
        System.out.println("Defense:    " + def);
        System.out.println("Health:     " + hp);
        System.out.println("Experience: " + exp);
    }

    public static void choose() {
        System.out.println("> Still Under Construction...");
    }
}