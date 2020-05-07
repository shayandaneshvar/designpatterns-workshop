package ir.ac.kntu.designpatterns.behavioral.memento;

import ir.ac.kntu.designpatterns.behavioral.command.mvc.Command;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.model.Text;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.view.View;
import ir.ac.kntu.designpatterns.behavioral.observer.model.Observable;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Stack;

public final class ViewWithMemory implements View {
    private Stage stage;
    private Scene scene;
    private Group root;
    private VBox vBox;
    private TextArea textArea;
    private Button button;
    private Command calculateCommand;
    private Stack<TextAreaMemento> mementoStack = new Stack<>();

    public ViewWithMemory(Stage primaryStage, Scene scene, Group root) {
        mementoStack.push(new TextAreaMemento(""));
        this.scene = scene;
        stage = primaryStage;
        this.root = root;
        vBox = new VBox();
        root.getChildren().add(vBox);
        textArea = new TextArea();
        button = new Button("Calculate");
        button.setPrefWidth(200d);
        button.setOnMouseEntered(event -> button.setTextFill(Color.RED));
        button.setOnMouseExited(event -> button.setTextFill(Color.BLUE));
        textArea.setPromptText("Enter Something ...");
        vBox.setSpacing(8d);
        vBox.setPadding(new Insets(12d));
        scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
            System.err.println("KEY");
            if (e.isAltDown() && e.getCode() == KeyCode.X) {
                textArea.setText(mementoStack.pop().getString());
            } else {
                mementoStack.push(new TextAreaMemento(textArea.getText()));
            }
        });
        getButton().setOnMouseClicked(event -> {
            calculateCommand.execute(this.getText());
        });
        draw(0);
    }

    public void setCalculateCommand(Command calculateCommand) {
        this.calculateCommand = calculateCommand;
    }

    public String getText() {
        return textArea.getText();
    }

    public Button getButton() {
        return button;
    }

    private void draw(Integer numberOfCharacters) {
        root.getChildren().clear();
        vBox.getChildren().clear();
        root.getChildren().add(vBox);
        javafx.scene.text.Text num = new javafx.scene.text.Text(
                "Number of Characters: " + numberOfCharacters);
        num.setFont(new Font("Helvetica", 24));
        num.setFill(Color.CYAN);
        vBox.getChildren().addAll(textArea, num, button);
    }

    public Scene getScene() {
        return scene;
    }

    @Override
    public void update(Observable observable) throws ClassCastException {
        Text text = (Text) observable;
        draw(Text.countNumberOfCharacters(text.getText()));
        //using a helper method in Model is ok but it is not ok if it is not a
        //helper method
    }
}