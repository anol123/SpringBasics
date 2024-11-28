package com.learningSpringFramework.BasicSpring.game;

public class MarioGame implements GamingConsole {
    public void left(){
        System.out.println("Move backward");
    }
    public void right(){
        System.out.println("Move forward");
    }
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Stop");
    }
}
