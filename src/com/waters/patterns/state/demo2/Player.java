package com.waters.patterns.state.demo2;

public class Player {
    private State state;

    public void setState(State state) {
        System.out.println("Player is "+state.name()+"ing!");
        this.state = state;
    }
}
