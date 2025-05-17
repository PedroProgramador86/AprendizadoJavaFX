package com.example.javafxaprendizado;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.w3c.dom.*;
import javafx.scene.text.Text;

public class Aula04 extends Application {

    public static void main (String[]args) {

        Application.launch(args);

    }

    @Override
    public void start(Stage stagePrimary) throws Exception {

        Group root = new Group(); // Criando Grupo
        Scene scene = new Scene(root, 600, 600, Color.AQUA); // Criando cena e atribuindo a ela o grupo raiz (root)
        //                          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Pode ser incrementado a largura, altura, cor nesse construtor de cenas

        // Criando um objeto do texto:
        Text text = new Text();
        // Imprimindo a mensagem do texto:
        text.setText("WHOOOLLLLLLLLL");
        // Cordenadas de onde o texto ira aparecer na tela:
        text.setX(50);
        text.setY(50);
        // Adiciona o Texto ao grupo (conteiner de elementos graficos)
        root.getChildren().add(text);

        Text text1 = new Text("Seja Bem vindo !");
        text1.setX(60);
        text1.setX(60);

        root.getChildren().add(text1);

        stagePrimary.setScene(scene); // Chamando o palco (stagePrimary) e adicionando a cena no palco (setScene(scene))
        stagePrimary.show(); // Mostrando as informações

    }
}
