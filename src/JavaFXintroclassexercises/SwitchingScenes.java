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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class SwitchingScenes extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        double x = 450;
        double y = 100;

        Label nameLabel = new Label();
        TextField txtField = new TextField();
        txtField.setPromptText("Insert Name Here");
        TextField txtPassword = new TextField();
        txtPassword.setPromptText("Password");
        Button btn1 = new Button("Go");
        Button btn2 = new Button("Go to login screen");

        HBox hbox1 = new HBox(txtField, txtPassword, btn1);
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
            readFromFile(txtField.getText(), txtPassword.getText());
            primaryStage.setScene(scene2);
        });

        btn2.setOnAction(event -> {
            primaryStage.setScene(scene1);
        });
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Boolean readFromFile(String user, String pass){

        try{
            File file = new File("userFile.txt");
            Scanner scanner = new Scanner(file);

            String realUser = scanner.nextLine();
            String realPass = scanner.nextLine();

            System.out.println(realUser);
            System.out.println(realPass);

        }catch (Exception e){
            e.printStackTrace();
        }
        Boolean confirmedUser = false;

        return confirmedUser;
    }
}
