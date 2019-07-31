package za.wethinkcode.swingy;

import java.util.Random;
import java.util.Scanner;

// import za.wethinkcode.swingy.hero.Hero;

public class App {
    public static void main( String[] args ) {
        Scanner choice = new Scanner(System.in);
        Random random = new Random();
        // Game Variables
        String[] enemies = { "skeleton", "zombie", "Assassin", "witch", "wizard", "fairy" };
        int maxEnemyHealth = 50;
        int enemyAtkDamage = 10;
        // Player variable
        int health = 100;
        int atkDamage = 25;
        int numHealthPotions = 3;
        int healthPotHealAmnt = 30;
        int healthPotDropChance = 35; //percentage
        boolean running = true;
        if(args.length == 1) {
            if(args[0].equals("gui")) {
                System.out.println("\033[31;1m|=====[Gui still under construction!]=====|\033[31;0m");
            } else if (args[0].equals("console")) {
                System.out.println("\033[32;1m[Welcome Sir/Madam]\033[32;0m");
                System.out.println("\033[32;1m[-SWING SWING-]\033[32;0m");
                GAME:
                while(running) {
                    int enemyHealth = random.nextInt(maxEnemyHealth);
                    String enemy = enemies[random.nextInt(enemies.length)];
                    System.out.println(enemy + " has appeared!");

                    while(enemyHealth > 0) {
                        System.out.println("> Your health : " + health);
                        System.out.println(enemy + "'s health : " + enemyHealth);
                        System.out.println("> Possible actions : 1 = attack, 2 = Drink health potion, 3 = Run!");

                        System.out.print("> input > ");
                        String input = choice.nextLine();
                        if(input.equals("1")) {
                            int damageDealt = random.nextInt(atkDamage);
                            int damageTaken = random.nextInt(enemyAtkDamage);

                            enemyHealth -= damageDealt;
                            health -= damageTaken;
                            System.out.println("> Striked " + enemy + "for damege = " + damageDealt);
                            System.out.println("> Your recieved " + damageTaken + " in retaliation");

                            if(health < 1) { 
                                System.out.println("> You have taken too much damage, you are too weak to go on!");
                                break ;
                            }
                        } else if(input.equals("2")) {
                            if(numHealthPotions > 0) {
                                health += healthPotHealAmnt;
                                numHealthPotions--;
                                System.out.println("> Drank health potion. Health increased by = " + healthPotHealAmnt + "." + "\n"
                                                    + "> Current health = " + health + " hp."
                                                    + "> You have " + numHealthPotions + " health potions left.");
                            } else {
                                System.out.println("> no health potions left. Defeat enemies to get more potions.");
                            }
                        } else if(input.equals("3")) {
                            System.out.println("> You ran away from enemy " + enemy + "!");
                            continue GAME;
                        } else { System.out.println("> Unknown Option"); }
                    }
                    if(health < 1) {
                        System.out.println("> Leaves the dungeon in a weakened state!");
                    }
                    System.out.println("> " + enemy + " defeated!");
                    System.out.println("> Current Health = " + health + " Hp left.");
                    if(random.nextInt(100) > healthPotDropChance) {
                        numHealthPotions++;
                        System.out.println("> The " + enemy + " dropped a health potion");
                        System.out.println("> Health potions = " + numHealthPotions + ".");
                        System.out.println("> Possible actions : 1 = Continue fighting, 2 = Exit the game!");

                        System.out.print("> input > ");
                        String input2 = choice.nextLine();
                        while(!input2.equals("1") && !input2.equals("2")) {
                            System.out.println("> Unknown Option");
                            input2 = choice.nextLine();
                        }
                        if(input2.equals("1")) {
                            System.out.println("> Choose to continue with adventure.");
                        } else if(input2.equals("2")) {
                            System.out.println("> Exits the dungeon!");
                            break ;
                        }
                    }
                    System.out.println("\033[32;1m[Thanks for playing]\033[32;0m");
                    System.out.println("\033[32;1m[-SWING SWING-]\033[32;0m");
                }
            //     System.out.println("\033[32;1m[Create a hero : Enter 1]\033[32;0m");
            //     System.out.println("\033[32;1m[use privious hero : Enter 2]\033[32;0m");
            //     System.out.print("\033[33;1m[What will it be] >> \033[33;0m");
            //     String choice1 = choice.nextLine();
            //     if(choice1.equals("1")){
            //         System.out.println("\033[33;1m[Hero Stats!]\33[33;0m");
            //         Hero.createHero();
            //     } else if(choice1.equals("2")){
            //         System.out.println("\033[33;1m[Choose to use a privious hero.]\033[33;0m");
            //         Hero.chooseHero();
            //     } else {
            //         System.out.println("\033[31;1m[unknown value!]\033[31;0m");
            //     }
            //     choice.close();
            // } else { System.out.println("\033[31;1m[unknown mode!]\033[31;0m"); }
            } else {
                System.out.println("\033[31;1m[You have to pass an argument of either gui or console.]\033[31;0m");
            }
        }
        choice.close();
    }
}