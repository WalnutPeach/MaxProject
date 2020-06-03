package ua.edu.npu.lab05.task01;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("../../../../../main.fxml"));
        stage.setTitle("Проста форма");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
