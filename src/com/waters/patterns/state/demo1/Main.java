package com.waters.patterns.state.demo1;

import com.waters.patterns.state.demo1.state.Run;
import com.waters.patterns.state.demo1.state.State;
import com.waters.patterns.state.demo1.state.Walk;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        State state = new Run();
        State state1 = new Walk();

        state.doAction(player);
        state1.doAction(player);
    }
}
