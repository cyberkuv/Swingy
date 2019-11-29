package com.wethinkcode.swingy.views;

import com.wethinkcode.swingy.model.*;

public class Style {
    public static  void print(String x){
        System.out.println(x);
    }

    public static void menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-----------------------------\033[33;1mWelcome Sir/Madam\033[32;1m-------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[--------------------------------\033[33;1mSWING SWING\033[32;1m----------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[---------------\033[33;1mOptions : 1 to Create new | 2 to Use Existing\033[32;1m-----------------]\033[32;0m");
        System.out.print("\033[33;1m[-choice->] \033[33;0m");
    }

    public static void selectHero() {
        System.out.println("\033[32;1m[-\033[33;1mHero class : 1 = Wizard | 2 = goblin | 3 = knight | 4 = cyborg | 5 = archer\033[32;1m-]\033[32;0m");
        System.out.print("\033[32;1m[-class->] \033[32;0m");
    }

    public static void invalidSelection() {
        System.out.println("\033[31;1m[-Unknown Option-]\033[31;0m");
    }

    public static void pressEnter() {
        System.out.print("\033[33;1m[-Click Enter-]\033[33;0m");
    }

    public static void menu2() {
        System.out.println("\033[32;1m[---------------\033[33;1mOptions : 1 to Start | 2 to Display Stats | 3 for Artifacts | 4 to Save | 5 to Exit\033[32;1m-----------------]\033[32;0m");
        System.out.print("\033[33;1m[-choice->] \033[33;0m");
    }

    public static void gameMenu2() {
        System.out.println("\033[32;1m[---------------\033[33;1mOptions : 1 to Start | 2 to Display Stats | 3 to Exit\033[32;1m-----------------]\033[32;0m");
        System.out.print("\033[33;1m[-choice->] \033[33;0m");
    }

    public static void quiting() {
        System.out.println("\033[31;1m[-Exiting-]\033[31;0m");
    }

    public static void quit() {
        System.out.print("\033[33;1mStill Wanna Quit? Y/N:[-choice->] \033[33;0m");
    }

    public static void getDirection() {
        System.out.println("\033[33;1m[----------------\033[33;1mOptions : n, e, s, w\033[32;1m---------------]\033[33;0m");
        System.out.print("\033[33;1m[-choice->] \033[33;0m");
    }

    public static void won() {
        System.out.println("\033[32;1m[----------------\033[33;1mVictory Is Yours\033[32;1m---------------]\033[32;0m");
    }

    public static void levelUp() {
        System.out.println("\033[32;1m[----------------\033[33;1mYou Have Leveled Up!!!\033[32;1m---------------]\033[32;0m");
    }

    public static void lost() {
        System.out.print("\033[31;1m[----------------\033[33;1mYou lost! Try Again Y/N?\033[31;1m---------------]\033[31;0m");
    }

    public static void display(Hero hero){
        if(hero.getArtifact() != 0){
            if(hero.getArtifact() == 1){
                System.out.println("\033[32;1mArtifact:  Weapon + 10\033[32;0m");
                System.console().readLine();
            }else if(hero.getArtifact() == 2){
                System.out.println("\033[32;1mArtifact:  Armor + 15\033[32;0m");
                System.console().readLine();
            }else {
                System.out.println("\033[32;1mArtifact:  Helm + 12\033[32;0m");
                System.console().readLine();
            }
        }else {
            System.out.println("\033[32;1mNo Artifacts Present\033[32;0m");
            System.console().readLine();
        }
    }

    public static void stats(Hero hero) {
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[----------------------Hero name:  \033[32;0m" + "\033[33;1m" + hero.getName() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Class:      \033[32;0m" + "\033[33;1m" + hero.getHeroClass() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Level:      \033[32;0m" + "\033[33;1m" + hero.getLevel() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Attack:     \033[32;0m" + "\033[33;1m" + hero.getAtt() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Defense:    \033[32;0m" + "\033[33;1m" + hero.getDef() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Health:     \033[32;0m" + "\033[33;1m" + hero.getHp() + "\033[33;0m");
        System.out.println("\033[32;1m[----------------------Experience: \033[32;0m" + "\033[33;1m" + hero.getExp() + "\033[33;0m");
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
    }

    public static void getName() {
        System.out.print("\033[33;1m[-Hero Name->] \033[33;0m");
    }

    public static void welcome() {
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-----------------------------\033[33;1mLet The Games Begin\033[32;1m-----------------------------]\033[32;0m");
        System.out.println("\033[32;1m[--------------------------------\033[33;1mSWING SWING\033[32;1m----------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
    }

    public static void equip() {
        System.out.println("\033[32;1m[---------------\033[33;1mOptions : Do You Wish To Equip item? # NOTE:: Items Aren't Stacked\033[32;1m-----------------]\033[32;0m");
        System.out.print("\033[33;1mY?N:[-choice->] \033[33;0m");
    }

    public static void dropped(int val) {
        if (val == 1)
            System.out.print("\033[33;1mMonster Dropped A Weapon\033[33;0m");
        else if (val == 2)
            System.out.print("\033[33;1mMonster Dropped A Armor\033[33;0m");
        else
            System.out.print("\033[33;1mMonster Dropped A Helm\033[33;0m");
    } 

    public static void checkSave() {
        System.out.print("\033[33;1mPlease Make Sure You Have Saved!\033[33;0m");
    }

    public static void encounter(int val) {
        if (val == 1) {
            System.out.print("\033[33;1mYou Have Met An Enemy\033[33;0m");
            System.out.print("\033[33;1mFight Y/N:[-choice->] \033[33;0m");
        }
        else
            System.out.print("\033[33;1mNo Enemy Found\033[33;0m");
    }

    public static void run(int val) {
        if (val == 1)
            System.out.println("\033[32;1m[------------------]Run Success[------------------]\033[32;0m");
        else
            System.out.print("\033[33;1m[-Running ain't an option-]\033[33;0m");
    }

    public static void mapCleared() {
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-------------------You Have Cleared This Map---------------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-------------------Do You Still Wish To Play? Y/N?---------------------------]\033[32;0m");
        System.out.println("\033[32;1m[-----------------------------------------------------------------------------]\033[32;0m");
        System.out.print("\033[33;1m[-choice->] \033[33;0m");
    }

    public static void loaded() {
        System.out.println("\033[33;1m[---------------]Load Complete[---------------]\033[33;0m");
        System.out.print("\033[33;1m[-Click Enter-]\033[33;0m");
    }

    public static void fileError(int val) {
        if (val == 1)
            System.err.println("\033[31;1m[-----Oops! Please check for the presence of file in the path specified-----]\033[31;0m");
        else
            System.err.println("\033[31;1m[-----Oops! Unable to read the file-----]\033[31;0m");
    }

    public static void selectHeroClass() {
        System.out.print("\033[33;1m[-class->] \033[33;0m");
    }

    public static void loading(int j, String[] data) {
        System.out.println("\033[33;1m" + j + ". - " + data[0] + " " + data[1] + "\033[33;0m");
    }
}