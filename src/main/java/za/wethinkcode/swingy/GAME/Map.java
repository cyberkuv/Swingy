package za.wethinkcode.swingy.GAME;

import java.util.Random;

import za.wethinkcode.swingy.HERO.Hero;

public class Map {
    public static Random random = new Random();
    static int mapSize = (Hero.lvl - 1) * 5 + 10 - (Hero.lvl % 2);
    static int occupied = (Hero.lvl * 7) + 5;
    static int hero = 1;
    public static void genMap() {
        int[][] board = new int[mapSize][mapSize];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 0;
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 0;
                for(int x = 0; x < occupied; x++) {
                    int randX = random.nextInt(board.length);
                    int randY = random.nextInt(board[randX].length);
                    board[randX][randY] = 1;
                }
                if(board[row][col] == 0) {
                    System.out.print(board[row][col] + " ");
                } else if(board[row][col] == 1) {
                    System.out.print("\033[31;1m" + board[row][col] + " \033[31;0m");
                }
            }
            System.out.println();
        }
        System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
        System.out.println("\t\t\033[32;1m> Number of Enemies : " + occupied + "\033[32;0m");
        System.out.println("\t\t\033[32;1m> map size   : " + mapSize + "\033[32;0m");
        System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
    }
}