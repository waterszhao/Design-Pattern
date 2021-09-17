package com.waters.patterns.state.demo2;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.setState(State.Run);
        player.setState(State.Walk);
        player.setState(State.Sleep);
    }
}
