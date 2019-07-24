package za.wethinkcode.swingy.hero;

import java.util.Scanner;

public class Hero {
    public static void createHero(){
        Scanner newHero = new Scanner(System.in);
        System.out.println("\033[32;1m[ Hero class : Wizard  | Worrior  | Gun Slinger  | ranger  | barbarian ]\033[32;0m");
        System.out.println("\033[32;1m[ Hero level :    1    |    1     |       1      |    1    |     1     ]\033[32;0m");
        System.out.println("\033[32;1m[ Hero Exp   :    0    |    0     |       0      |    0    |     0     ]\033[32;0m");
        System.out.println("\033[32;1m[ Hero Atk   :    5    |    7     |       9      |    9    |     11    ]\033[32;0m");
        System.out.println("\033[32;1m[ Hero Def   :    11   |    6     |       4      |    4    |     2     ]\033[32;0m");
        System.out.println("\033[32;1m[ Hero Hp    :    5    |    5     |       5      |    5    |     5     ]\033[32;0m");
        System.out.println("\033[33;1m[   Weapon   :    0    |    0     |       0      |    0    |     0     ]\033[33;0m");
        System.out.println("\033[33;1m[   Armor    :    0    |    0     |       0      |    0    |     0     ]\033[33;0m");
        System.out.println("\033[33;1m[   Helm     :    0    |    0     |       0      |    0    |     0     ]\033[33;0m");
        System.out.print("\033[32;1m|=====[ Your Choice >> \033[32;0m");
        String choice = newHero.nextLine();
        if(choice.equalsIgnoreCase("wizard")){
            System.out.println("\033[33;1m>> Choose a wizard.\033[33;0m");
        } else if (choice.equalsIgnoreCase("warrior")) {
            System.out.println("\033[33;1m>> Choose a warrior.\033[33;0m");
        } else if (choice.equalsIgnoreCase("Gun Slinger")) {
            System.out.println("\033[33;1m>> Choose a Gun Slinger.\033[33;0m");
        } else if (choice.equalsIgnoreCase("ranger")) {
            System.out.println("\033[33;1m>> Choose a ranger.\033[33;0m");
        } else if (choice.equalsIgnoreCase("barbarian")) {
            System.out.println("\033[33;1m>> Choose a barbarian.\033[33;0m");
        } else {
            System.out.println("\033[31;1m|=====[unknown class!]=====|\033[31;0m");            
            System.exit(1);
        }
        System.out.print("\033[32;1m|=====[ Your Name   >> \033[32;0m");
        String name = newHero.nextLine();
        System.out.println("\033[33;1mNew Player Created : " + "[" + name + " as a " + choice + "]\033[33;0m");
        // System.out.print("\033[32;1m|=====[Hero name >> \033[32;0m" + newHero.nextLine() );
        // System.out.println(newHero.nextLine());
        // System.out.println("\033[32;1m|======playing as : [-\033[32;0m"
        //     + player.nextLine().toUpperCase() + "\033[32;1m-]====|\033[32;0m");
        newHero.close();
    }
    public static void chooseHero(){}
}