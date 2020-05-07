package ir.ac.kntu.designpatterns.behavioral.command.mvc.controller;


import ir.ac.kntu.designpatterns.behavioral.command.mvc.Command;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.model.Text;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.view.View;

public class Controller {
    private Text text = null;

    public Controller(View viewImpl) {
        text = new Text("");
        text.addObserver(viewImpl);
        Command calculateCommand = (o) -> {
            String string = (String) o;
            text.clear().append(string);
            text.updateAllObservers();
        };
        viewImpl.setCalculateCommand(calculateCommand);
    }

}
