package ir.ac.kntu.designpatterns.behavioral.observer.model;

import ir.ac.kntu.designpatterns.behavioral.observer.presenter.Observer;
//publisher
public interface Observable {
    void addObserver(Observer observer);

    void updateAllObservers();
}
