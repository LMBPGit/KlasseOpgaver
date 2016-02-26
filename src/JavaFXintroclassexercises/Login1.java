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

public class Login1 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label nameLabel = new Label();
        TextField txtField = new TextField();
        txtField.setPromptText("Insert Name Here");
        Button btn = new Button("Go");

        btn.setOnAction(event -> {
            nameLabel.setText("Hello " + txtField.getText());
        });

        HBox hbox = new HBox(txtField, btn);
        hbox.setPrefSize(300, 100);
        hbox.setPadding(new Insets(20, 20, 20, 20));
        hbox.setSpacing(20);

        HBox labelBox = new HBox(nameLabel);
        VBox vBox = new VBox(hbox, labelBox);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
