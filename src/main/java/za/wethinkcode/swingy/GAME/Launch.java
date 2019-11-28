package za.wethinkcode.swingy.GAME;

import java.util.*;
import za.wethinkcode.swingy.HERO.*;

public class Launch {
    public static Random random = new Random();
    public static int size = (Hero.lvl - 1) * 5 + 10 - (Hero.lvl % 2);
    public static int occupied = Hero.lvl * 9 + 5;
    public static char hero = '#';
    public static char[][] board = new char[size][size];

    public static void genMap(int xc, int yc) {
        xc = Hero.x;
        yc = Hero.y;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '$';
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '$';

                for(int x = 0; x < occupied; x++) {
                    char randX = (char)random.nextInt(board.length);
                    char randY = (char)random.nextInt(board[randX].length);
                    board[randX][randY] = '*';
                    board[xc = size / 2][yc = size/ 2] = hero;
                }

                if(board[row][col] == '$') {
                    System.out.print("\033[33;1m" + board[row][col] + " \033[33;0m");
                } else if(board[row][col] == '*') {
                    System.out.print("\033[31;1m" + board[row][col] + " \033[31;0m");
                } else if(board[row][col] == '#') {
                    System.out.print("\033[32;1m" + board[row][col] + " \033[32;0m");
                }
            }
            System.out.println();
        }
        System.out.println("\033[32;1m[-Number of Enemies : " + occupied + "-]\033[32;0m");
        System.out.println("\033[32;1m[-Map size : " + size + " X " + size + "-]\033[32;0m");
        System.out.println("\033[32;1m[-Hero Level : " + Hero.lvl + "-]\033[32;0m");
        player(hero, xc, yc);
    }

    public static void player(char hero, int x, int y) {
        x = Hero.x;
        y = Hero.y;
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[32;1m[----------------\033[33;1mOptions : n, e, s, w\033[32;1m---------------]\033[32;0m");
        System.out.print("\033[32;1m[-input->] \033[32;0m");
        String mv = sc.nextLine();

        if(mv.equalsIgnoreCase("n")) {
            x++;
            System.out.println(x);
            System.out.println("north");
            genMap(x, y);
        } else if (mv.equalsIgnoreCase("e")) {
            y++;
            System.out.println(y);
            System.out.println("east");
        } else if(mv.equalsIgnoreCase("s")) {
            x--;
            System.out.println(x);
            System.out.println("south");
        } else if(mv.equalsIgnoreCase("w")) {
            y--;
            System.out.println(y);
            System.out.println("west");
        } else { System.out.println("\033[31;1m[-Unknown Option-]\033[31;0m"); player(hero, x, y); }
        sc.close();
    }
}