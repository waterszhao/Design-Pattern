package com.waters.patterns.state.demo1.state;

import com.waters.patterns.state.demo1.Player;

public class Run implements State{
    @Override
    public void doAction(Player player) {
        System.out.println("Player is Running!");
        player.setState(this);
    }
}
