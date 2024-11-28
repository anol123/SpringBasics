package com.learningSpringFramework.BasicSpring.game;

public class ContraGame implements GamingConsole {
    public void left(){
        System.out.println("Move backward-contra");
    }
    public void right(){
        System.out.println("Move forward-contra");
    }
    public void up(){
        System.out.println("Jump-contra");
    }
    public void down(){
        System.out.println("Stop-contra");
    }
}
