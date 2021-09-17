package com.waters.patterns.observer.observer;

import com.waters.patterns.observer.Subject;

public abstract class Observer {
    Subject subject;

    public Observer(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    public abstract void update();
}
