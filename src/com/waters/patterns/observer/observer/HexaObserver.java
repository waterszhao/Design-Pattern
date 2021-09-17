package com.waters.patterns.observer.observer;

import com.waters.patterns.observer.Subject;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(Integer.toHexString(subject.getState()));
    }
}
