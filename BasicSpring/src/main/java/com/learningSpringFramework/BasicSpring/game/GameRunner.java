package com.learningSpringFramework.BasicSpring.game;

public class GameRunner {
    //private MarioGame game;
    //private ContraGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run(){
        game.up();
        game.left();
        game.right();
        game.down();
    }

}
