package ir.ac.kntu.designpatterns.behavioral.command.mvc.controller;


import ir.ac.kntu.designpatterns.behavioral.command.mvc.Command;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.model.Text;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.view.View;

public class Controller {
    private Text text = null;

    public Controller(View view) {
        text = new Text("");
        text.addObserver(view);
        Command calculateCommand = (o) -> {
            String string = (String) o;
            text.clear().append(string);
            text.updateAllObservers();
        };
        view.setCalculateCommand(calculateCommand);
    }

}
