package com.example.javafxaprendizado;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Aula04 extends Application {

    public static void main (String[]args) {

        Application.launch(args);

    }

    @Override
    public void start(Stage stagePrimary) throws Exception {

        Group root = new Group(); // Criando Grupo
        Scene scene = new Scene(root, 1200, 600, Color.AQUA); // Criando cena e atribuindo a ela o grupo raiz (root)
        //                          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Pode ser incrementado a largura, altura, cor nesse construtor de cenas

        // Criando um objeto do texto:
        Text text = new Text();
        // Imprimindo a mensagem do texto:
        text.setText("WHOOOLLLLLLLLL");
        // Cordenadas de onde o texto ira aparecer na tela:
        text.setX(50);
        text.setY(50);

        // Modificando a fonte do texto:
        text.setFont(Font.font("Arial", 20));

        // Adiciona o Texto ao grupo (conteiner de elementos graficos)
        root.getChildren().add(text);

        // Mudando a cor do texto:
        text.setFill(Color.GOLD);

        // Criando uma Linha:
        Line line = new Line();

        line.setStartX(300); // Onde a linha vai começar pelo eixo X
        line.setStartY(400); // onde a linha vai começar pelo eixo Y
        line.setEndX(500);// onde a linha vai terminar pelo eixo X
        line.setEndY(800);// onde a linha vai começar pelo eixo Y

        line.setStrokeWidth(6); // grossura da linha
        line.setStroke(Color.DARKORANGE); // Muda a cor da Linha
        line.setOpacity(0.5); // Alteraa opacidade (transparencia) da linha
        line.setRotate(34); // Vira a linha em 34º

        // Adiciona a linha ao grupo de elementos dentro do cenario
        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();

        rectangle.setX(400);
        rectangle.setY(500);
        rectangle.setWidth(300);
        rectangle.setHeight(100);

        root.getChildren().add(rectangle);

        stagePrimary.setScene(scene); // Chamando o palco (stagePrimary) e adicionando a cena no palco (setScene(scene))
        stagePrimary.show(); // Mostrando as informações

    }
}
