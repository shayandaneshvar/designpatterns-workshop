package ir.ac.kntu.designpatterns.behavioral.observer.presenter;

import ir.ac.kntu.designpatterns.behavioral.observer.model.Observable;
//Subscriber
public interface Observer {
    void update(Observable observable);
}
