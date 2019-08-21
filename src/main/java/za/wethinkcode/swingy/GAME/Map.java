package za.wethinkcode.swingy.GAME;

import java.util.Random;
import java.util.Scanner;

import za.wethinkcode.swingy.HERO.Hero;

public class Map {
    public static Random random = new Random();
    static int mapSize = (Hero.lvl - 1) * 5 + 10 - (Hero.lvl % 2);
    public static int[][] board = new int[mapSize][mapSize];
    static int occupied = (Hero.lvl * 9) + 5;
    static int hero = 2;
    public static void genMap() {

        System.out.println("\t\t\033[32;1m> Number of Enemies : " + occupied + "\033[32;0m");
        System.out.println("\t\t\033[32;1m> map size   : " + mapSize + " x " + mapSize + "\033[32;0m");
        System.out.println("\033[30;1m|--------------------------------------------------------------------|\033[30;0m");

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
                    genPlayer(hero);
                }

                if(board[row][col] == 0) {
                    System.out.print("\033[33;1m" + board[row][col] + " \033[33;0m");
                } else if(board[row][col] == 1) {
                    System.out.print("\033[31;1m" + board[row][col] + " \033[31;0m");
                } else if(board[row][col] == 2) {
                    System.out.print("\033[32;1m" + board[row][col] + " \033[32;0m");
                }
            }
            System.out.println();
        }
        System.out.println("\033[30;1m|--------------------------------------------------------------------|\033[30;0m");
    }

    public static void genPlayer(int hero) {
        for(int p = 0; p != occupied; p++) {
            // board[mapSize / 2][mapSize / 2] = hero;
            board[Hero.x = mapSize / 2][Hero.y = mapSize / 2] = hero;
        }
    }

    public static void movement() {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.nextLine();

        if(move.equalsIgnoreCase("1")){
            System.out.println("Choose to go north");
        } else {
            System.out.println("unknown value.");
            movement();
        }
        scanner.close();
    }
}