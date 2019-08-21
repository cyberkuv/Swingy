package za.wethinkcode.swinger;

import za.wethinkcode.swinger.OPTIONS.Options;

public class App 
{
    public static void main( String[] args )
    {
        if(args.length == 1)
        {
            if(args[0].equals("gui")) {
                System.out.println("\033[31;1m> still under construction\033[31;0m");
            }
            else if(args[0].equals("console")) {
                Options.ig_option();
            }
            else {
                System.out.println("> unknown option...");
            }
        }
        else {
            System.out.println("\033[31;1m> takes in one arguement\033[31;0m");
        }
    }
}
