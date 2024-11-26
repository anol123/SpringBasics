package com.learningSpringFramework.BasicSpring;

import com.learningSpringFramework.BasicSpring.game.GameRunner;
import com.learningSpringFramework.BasicSpring.game.MarioGame;

public class App01GamingJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
