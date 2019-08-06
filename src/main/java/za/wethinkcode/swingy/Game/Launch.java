package za.wethinkcode.swingy.Game;

import java.util.Random;
import java.util.Scanner;

import za.wethinkcode.swingy.hero.Hero;

public class Launch {
    public static void gameLaunch() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] enemies = { "skeleton", "zombie", "Assassin", "witch", "wizard", "fairy" };
        int maxEnemyHealth = 50;
        int enemyAtkDamage = 35;
        int health = 60;
        // int def = 10;
        int lvl = 1;
        int exp = 1;
        int atkDamage = 40;
        int numHealthPotions = 3;
        int healthPotHealAmnt = 3;
        int healthPotDropChance = 35; // percentage
        boolean running = true;
        // Hero hero = new Hero();
        System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
        System.out.println("\033[32;1m\t\t" + "> Hero Name  : " + Hero.name + ".\n\t\t" + "> Class      : " + Hero.hClass + ".\n\t\t" + "> Level      : "
                            + lvl + ".\n\t\t" + "> Experience : " + exp + ".\n\t\t" + "> Hp         : " + health + ".\033[32;0m");
        System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
        GAME: while (running) {
            int enemyHealth = random.nextInt(maxEnemyHealth);
            String enemy = enemies[random.nextInt(enemies.length)];
            System.out.println("\033[31;1m> " + enemy + " has appeared!\033[31;0m");

            while (enemyHealth > 0) {
                System.out.println("\033[32;1m> Your health : " + health + "\033[33;0m");
                System.out.println("\033[31;1m> " + enemy + "'s health : " + enemyHealth + "\033[31;0m");
                System.out.println(
                        "\033[33;1m> Possible actions : 1 = attack, 2 = Drink health potion, 3 = Run!\033[33;0m");

                System.out.print("\033[33;1m> input > \033[33;0m");
                String input = scanner.nextLine();
                if (input.equals("1")) {
                    int damageDealt = random.nextInt(atkDamage);
                    int damageTaken = random.nextInt(enemyAtkDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                    System.out.println("\033[32;1m> " + enemy + " takes damage = " + damageDealt + "\033[32;0m");
                    System.out.println("\033[31;1m> Damage taken = " + damageTaken + ", in retaliation\033[31;0m");

                    if (health < 1) {
                        System.out.println(
                                "\033[31;1m> You have sustained too much damage and are too weak to go on!\033[31;0m");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotHealAmnt;
                        numHealthPotions--;
                        System.out.println("\033[32;1m> Drank health potion. Health increased by = " + healthPotHealAmnt
                                + "." + "\n" + "> Current health = " + health + " hp." + "> You have "
                                + numHealthPotions + " health potions left.\033[32;0m");
                    } else {
                        System.out.println(
                                "\033[31;1m> no health potions left. Defeat enemies to get more potions.\033[31;0m");
                    }
                } else if (input.equals("3")) {
                    System.out.println("\033[33;1m> You ran away from enemy " + enemy + "!\033[33;0m");
                    continue GAME;
                } else {
                    System.out.println("\033[31;1m> Unknown Option\033[31;0m");
                }
            }
            if (health < 1) {
                System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
                System.out.println("\t\t\033[31;1m  [" + Hero.name + " Lost!]\033[31;0m");
                System.out.println("\033[30;1m|----------------------------------------------------------|\033[30;0m");
                System.exit(-1);
            }
            System.out.println("\033[32;1m> " + enemy + " defeated!\033[32;0m");
            System.out.println("\033[33;1m> Current Health = " + health + " Hp left.\033[33;0m");
            if (random.nextInt(100) > healthPotDropChance) {
                numHealthPotions++;
                System.out.println("\033[32;1m> The " + enemy + " dropped a health potion\033[32;0m");
                System.out.println("\033[32;1m> Health potions = " + numHealthPotions + ".\033[32;0m");
                System.out.println("\033[33;1m> Possible actions : 1 = Continue, 2 = Exit\033[33;0m");

                System.out.print("\033[33;1m> input > \033[33;0m");
                String input2 = scanner.nextLine();
                while (!input2.equals("1") && !input2.equals("2")) {
                    System.out.println("\033[31;1m> Unknown Option\033[31;0m");
                    input2 = scanner.nextLine();
                }
                if (input2.equals("1")) {
                    System.out.println("\033[32;1m> Choose to continue with adventure.\033[32;0m");
                } else if (input2.equals("2")) {
                    System.out.println("\033[31;1m]> Exits the dungeon!\033[31;0m");
                    break;
                }
            }
        }
        System.out.println("\t\t\t\033[32;1m[Thanks for playing]\033[32;0m");
        System.out.println("\t\t\t\033[32;1m  [-SWING SWING-]\033[32;0m");
        scanner.close();
    }
}