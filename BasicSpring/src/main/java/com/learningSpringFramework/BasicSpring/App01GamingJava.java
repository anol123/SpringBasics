package com.learningSpringFramework.BasicSpring;

import com.learningSpringFramework.BasicSpring.game.ContraGame;
import com.learningSpringFramework.BasicSpring.game.GameRunner;
import com.learningSpringFramework.BasicSpring.game.MarioGame;
import com.learningSpringFramework.BasicSpring.game.PacMan;

public class App01GamingJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new ContraGame();
        //var game = new PacMan();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
