package za.wethinkcode.swingy.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    Button newP;
    Button prevP;
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("-SWING SWING-");
        newP = new Button();
        prevP = new Button();
        newP.setText("New Hero");
        newP.setStyle("-fx-background-color: green");
        newP.setTextFill(Color.GOLD);
        newP.setLayoutX(100); // Sets the X co-ordinate
        newP.setLayoutY(200);
        prevP.setText("Privious Hero");
        prevP.setStyle("-fx-background-color: green");
        prevP.setTextFill(Color.GOLD);

        StackPane layout = new StackPane();
        layout.getChildren().add(newP);
        // layout.getChildren().add(prevP);
        Scene scene = new Scene(layout, 600, 800);
        stage.setScene(scene);    
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}