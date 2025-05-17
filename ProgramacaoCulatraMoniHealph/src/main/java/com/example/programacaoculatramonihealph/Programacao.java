package com.example.programacaoculatramonihealph;

// MoniHealthApp.java
// MoniHealthApp.java
// MoniHealthApp.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class Programacao extends Application {
    private Stage mainStage;

    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        showLoginScreen();
        mainStage.setTitle("MoniHealth");
        mainStage.show();
    }

    public void showLoginScreen() {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(40));
        layout.setAlignment(Pos.CENTER);

        Label title = new Label("Login");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Usuário");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Senha");
        Button loginButton = new Button("Entrar");
        Button cadastrarButton = new Button("Cadastrar");

        loginButton.setOnAction(e -> showAgendaScreen());
        cadastrarButton.setOnAction(e -> showCadastroScreen());

        layout.getChildren().addAll(title, usernameField, passwordField, loginButton, cadastrarButton);

        Scene scene = new Scene(layout, 800, 500);
        mainStage.setScene(scene);
    }

    public void showCadastroScreen() {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(40));
        layout.setAlignment(Pos.CENTER);

        Label title = new Label("Cadastro");
        TextField nomeField = new TextField();
        nomeField.setPromptText("Nome completo");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        Button proximoButton = new Button("Próximo");

        proximoButton.setOnAction(e -> showCadastroSenhaScreen());

        layout.getChildren().addAll(title, nomeField, emailField, proximoButton);

        Scene scene = new Scene(layout, 800, 500);
        mainStage.setScene(scene);
    }

    public void showCadastroSenhaScreen() {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(40));
        layout.setAlignment(Pos.CENTER);

        Label title = new Label("Cadastro de Senha");
        PasswordField senhaField = new PasswordField();
        senhaField.setPromptText("Digite sua senha");
        PasswordField confirmarSenhaField = new PasswordField();
        confirmarSenhaField.setPromptText("Confirme sua senha");
        Button finalizarButton = new Button("Finalizar Cadastro");

        finalizarButton.setOnAction(e -> showAgendaScreen());

        layout.getChildren().addAll(title, senhaField, confirmarSenhaField, finalizarButton);

        Scene scene = new Scene(layout, 800, 500);
        mainStage.setScene(scene);
    }

    public void showAgendaScreen() {
        BorderPane layout = new BorderPane();

        Label header = new Label("Agenda MoniHealth");
        header.setStyle("-fx-font-size: 24px; -fx-padding: 20px;");
        layout.setTop(header);
        BorderPane.setAlignment(header, Pos.CENTER);

        TilePane icones = new TilePane();
        icones.setPadding(new Insets(20));
        icones.setHgap(20);
        icones.setVgap(20);
        icones.setAlignment(Pos.CENTER);

        for (int i = 1; i <= 6; i++) {
            Button botao = new Button("Icone " + i);
            botao.setPrefSize(100, 100);
            icones.getChildren().add(botao);
        }

        layout.setCenter(icones);

        Scene scene = new Scene(layout, 1024, 600);
        mainStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

