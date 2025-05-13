/******************************************************************************

 Explicação Basica para mostrar uma tela com o uso do JavaFX

 Siga as orientações através das numerações "1. , 2. , 3. , ..."

 Resumo:

 (1. - 4.1.) - Montando o escopo de um codigo inicial em javaFX (mas sem rodar definitivamente nada)
 (5. - 8.) - Montando a tela

 (OBS: Para não entrar em infinitos detalhes, será especificado apenas partes
 relacionadas ao javaFX, nada de programação basica ou POO em java)

 *******************************************************************************/

package com.example.javafxaprendizado;

// 1. Importamos a classe pai do javaFX (no caso o "Application"):
import javafx.application.Application;

// Com a IDE, essas imporações a seguir serão colocadas automaticamente:
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

// 2. Extendemos nossa classe pricipal para a classe pai Application:
public class ExplicacaoBasica extends Application{

    // 4. Criamos a função principal, colocando nela, uma função para dar inicio ao codigo quando executado
    public static void main (String[]args){
        Application.launch(args); // 4.1 Essa função recebe os argumentos (args) da função principal
    }

    // 3. Implementamos Obrigatoriamente o metodo de "Start" do Application
    @Override
    public void start(Stage stagePrimary) throws Exception {
        //^^^^^^^^^^^^^^^^^^
        // 3.1 Podemos definir aqui como será chamado o "Palco" (Stage) do start

        // 6. Criamos um grupo para organizar todos os nós diferentes (que são os componentes)
        Group root = new Group();

        // 7. Criamos a "cena" (Scene) e em seguida adicionamos esse "grupo de nós" criado anteriormente na "cena"
        Scene scene = new Scene(root);

        // 8. Chamamos o "palco" e utilizamos o "setScene" para adicionar a "cena" no "palco"
        stagePrimary.setScene(scene);

        // 5. Definimos logo mostrar das telas de acordo com as configurações realizadas
        // (boas praticas mas muito importante para não esquecer):
        stagePrimary.show();
    }
}
