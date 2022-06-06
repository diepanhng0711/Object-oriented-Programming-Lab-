package AimsProject.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Aims extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Aims.class.getResource("AimsMainGUIController.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("An Internet Media Store 1.0(AIMS 1.0)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}