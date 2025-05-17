package com.example.praticaposaprendizado;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pratica1 extends Application{

    public static void main (String[]args){

        Application.launch(args);

    }

    @Override
    public void start(Stage stagePrimary) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 1000, 510, Color.AQUAMARINE);

        stagePrimary.setTitle("Primeiro Prototipo");

        Text texto1 = new Text();
        texto1.setText("Hello JavaFX ! Essa é o meu primeiro teste de prototipo");
        texto1.setX(50);
        texto1.setY(50);

        root.getChildren().add(texto1);

        Text texto2 = new Text();
        texto2.setText("Olá eu de novo !");
        texto2.setX(80);
        texto2.setY(70);

        root.getChildren().add(texto2);

        stagePrimary.setScene(scene);
        stagePrimary.show();

    }
}
