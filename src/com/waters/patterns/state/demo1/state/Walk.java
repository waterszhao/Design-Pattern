package com.waters.patterns.state.demo1.state;

import com.waters.patterns.state.demo1.Player;

public class Walk implements State{

    @Override
    public void doAction(Player player) {
        System.out.println("Player is Walking!");
        player.setState(this);
    }
}
