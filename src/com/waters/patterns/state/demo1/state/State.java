package com.waters.patterns.state.demo1.state;

import com.waters.patterns.state.demo1.Player;

public interface State {
    void doAction(Player player);
}
