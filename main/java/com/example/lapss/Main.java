package com.example.lapss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
//    public void start(Stage stage) throws IOException {
//        new DBConn();
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//
//    }
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        root.setPadding(new Insets(15,15,15,15));

        // Button 1
        Button button1= new Button("Button1");
        root.getChildren().add(button1);


        // Button 2
        Button button2 = new Button("Button2");
        button2.setPrefSize(100, 100);
        root.getChildren().add(button2);




        Scene scene = new Scene(root, 550, 250);

        primaryStage.setTitle("FlowPane Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}