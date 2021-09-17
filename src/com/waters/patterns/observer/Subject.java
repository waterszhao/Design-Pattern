package com.waters.patterns.observer;

import com.waters.patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers;
    private int state;

    public Subject(){
        observers = new ArrayList<>();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        noticeAll();
    }

    public int getState() {
        return state;
    }

    private void noticeAll(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
