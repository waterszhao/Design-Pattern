package com.waters.patterns.observer.observer;

import com.waters.patterns.observer.Subject;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){ super(subject);
    }
    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(subject.getState()));
    }
}
