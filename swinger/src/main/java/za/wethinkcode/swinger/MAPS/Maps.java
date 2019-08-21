package za.wethinkcode.swinger.MAPS;

import java.util.Random;

import za.wethinkcode.swinger.HERO.Hero;

public class Maps
{
    public static Random random = new Random();
    public static int size = (Hero.lvl - 1) * 5 + 10 - (Hero.lvl % 2);
    public static int occupied = Hero.lvl * 9 + 5;
    public static char hero = '\\';
    public static char[][] board = new char[size][size];

    public static void genMap() {
        System.out.println("\033[30;1m|--------------------------------------------------------------------|\033[30;0m");
        System.out.println("\t\t\033[32;1m> Number of Enemies : " + occupied + "\033[32;0m");
        System.out.println("\t\t\033[32;1m> map size   : " + size + " x " + size + "\033[32;0m");
        System.out.println("\033[30;1m|--------------------------------------------------------------------|\033[30;0m");

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '|';
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '|';

                for(int x = 0; x < occupied; x++) {
                    char randX = (char)random.nextInt(board.length);
                    char randY = (char)random.nextInt(board[randX].length);
                    board[randX][randY] = '/';
                    for(int y = 0; y != occupied; y++) {
                        board[Hero.x = size / 2][Hero.y = size / 2] = hero;
                    }
                }

                if(board[row][col] == '|') {
                    System.out.print("\033[33;1m" + board[row][col] + " \033[33;0m");
                } else if(board[row][col] == '/') {
                    System.out.print("\033[31;1m" + board[row][col] + " \033[31;0m");
                } else if(board[row][col] == '\\') {
                    System.out.print("\033[32;1m" + board[row][col] + " \033[32;0m");
                }
            }
            System.out.println();
        }
    }
}