package com.learningSpringFramework.BasicSpring.game;

public class PacMan implements GamingConsole {
    public void left(){
        System.out.println("Move backward-pac");
    }
    public void right(){
        System.out.println("Move forward-pac");
    }
    public void up(){
        System.out.println("Jump-pac");
    }
    public void down(){
        System.out.println("Stop-pac");
    }
}
