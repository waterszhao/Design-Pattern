package com.waters.patterns.observer.observer;

import com.waters.patterns.observer.Subject;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(Integer.toOctalString(subject.getState()));
    }
}
