package com.wethinkcode.swingy.main;

import com.wethinkcode.swingy.controller.*;

public class Play {
    public static void main(String args[]) {
        game game = new game();

        while (true)
            game.menu();
    }

}