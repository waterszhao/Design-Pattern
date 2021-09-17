package com.waters.patterns.state.demo1;

import com.waters.patterns.state.demo1.state.State;

public class Player {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Player{" +
                "state=" + state +
                '}';
    }
}
