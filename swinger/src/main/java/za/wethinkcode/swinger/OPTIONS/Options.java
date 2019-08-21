package za.wethinkcode.swinger.OPTIONS;

import java.util.Scanner;

import za.wethinkcode.swinger.HERO.Hero;
import za.wethinkcode.swinger.MAPS.Maps;

public class Options
{
    public static void ig_option() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t\t-SWINGER-");
        System.out.println("> Options : 1 = Create Hero, 2 = Use Hero, 3 = Hero Types, 4 = Help!");
        System.out.print("> Input : ");
        String input = sc.nextLine();
        if(input.equals("1")) {
            Hero.create();
        }
        else if(input.equals("2")) {
            Hero.choose();
        }
        else if(input.equals("3")) {
            System.out.println("> Still Under Construction...");
        }
        else if(input.equals("4")) {
            System.out.println("> Still Under Construction...");
        }
        else {
            System.out.println("> Invalid option..");
            ig_option();
        }
        sc.close();
    }

    public static void lun_option() {
        Scanner sc = new Scanner(System.in);
        System.out.println("> Options : 1 = Launch, 2 = Choose Hero, 3 = Create Hero, 4 = Stats, 5 = exit!");
        System.out.print("> Input : ");
        String input = sc.nextLine();

        if(input.equals("1")) {
            Maps.genMap();
        }
        else if(input.equals("2")) {
        }
        else if(input.equals("3")) {
        }
        else if(input.equals("4")) {
        }
        else if(input.equals("5")) {
        }
        else {
            System.out.println("> Invalid option..");
            lun_option();
        }
        sc.close();
    }
}