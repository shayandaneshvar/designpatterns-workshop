package ir.ac.kntu.designpatterns.behavioral.command.mvc.view;

import ir.ac.kntu.designpatterns.behavioral.command.mvc.Command;
import ir.ac.kntu.designpatterns.behavioral.observer.presenter.Observer;

public interface View extends Observer {
    void setCalculateCommand(Command command);
}
