package ir.ac.kntu.designpatterns.behavioral.memento;

import ir.ac.kntu.designpatterns.behavioral.command.mvc.model.Text;
import javafx.scene.control.TextField;

public class TextAreaMemento {
    private String string;

    public String getString() {
        return string;
    }

    public TextAreaMemento(String string) {
        this.string = string;
    }
}
