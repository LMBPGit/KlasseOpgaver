package JavaFXintroclassexercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchingScenes extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        double x = 300;
        double y = 100;

        Label nameLabel = new Label();
        TextField txtField = new TextField();
        txtField.setPromptText("Insert Name Here");
        Button btn1 = new Button("Go");
        Button btn2 = new Button("Go to login screen");

        HBox hbox1 = new HBox(txtField, btn1);
        hbox1.setPrefSize(x, y);
        hbox1.setPadding(new Insets(20, 20, 20, 20));
        hbox1.setSpacing(20);
        HBox labelBox = new HBox(nameLabel, btn2);

        Scene scene1 = new Scene(hbox1);

        labelBox.setPrefSize(x, y);
        labelBox.setPadding(new Insets(20, 20, 20, 20));
        labelBox.setSpacing(20);
        Scene scene2 = new Scene(labelBox);

        btn1.setOnAction(event -> {
            nameLabel.setText("Hello " + txtField.getText());
            primaryStage.setScene(scene2);
        });

        btn2.setOnAction(event -> {
            primaryStage.setScene(scene1);
        });
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
