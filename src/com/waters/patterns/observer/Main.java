package com.waters.patterns.observer;

import com.waters.patterns.observer.observer.BinaryObserver;
import com.waters.patterns.observer.observer.HexaObserver;
import com.waters.patterns.observer.observer.OctalObserver;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new OctalObserver(subject);
        new HexaObserver(subject);
        new BinaryObserver(subject);

        subject.setState(52);
    }
}
