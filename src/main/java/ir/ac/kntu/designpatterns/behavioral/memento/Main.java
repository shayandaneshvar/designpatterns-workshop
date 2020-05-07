package ir.ac.kntu.designpatterns.behavioral.memento;

import ir.ac.kntu.designpatterns.behavioral.command.mvc.controller.Controller;
import ir.ac.kntu.designpatterns.behavioral.command.mvc.view.View;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 300, Color.GRAY.darker());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Info Extractor");
        primaryStage.show();
        View viewImpl = new ViewWithMemory(primaryStage,scene,root);
        new Controller(viewImpl);
    }

    public static void main(String[] args) {
        launch();
    }
}
