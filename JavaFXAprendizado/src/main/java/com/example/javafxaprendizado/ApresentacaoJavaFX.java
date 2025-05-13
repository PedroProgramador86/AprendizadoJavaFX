package com.example.javafxaprendizado; // Informando o pacote (package) que será executado o codigo

import javafx.application.Application; // Importa a classe pai (Application) do javaFX
import javafx.scene.Group; // Importa a classe Group para conseguir fazer "nós"
import javafx.scene.Scene; // Importa a classe Scene para fazer a criação de cenas no javaFX
import javafx.scene.image.Image;
import javafx.scene.paint.Color; // Importando a classe de cores que serão utilizadas
import javafx.stage.Stage; // Importa a classe stage, que representa a janela principal

public class ApresentacaoJavaFX extends Application{


    public static void main(String[] args) {

        Application.launch(args);       // Esse método estático da classe Application inicializa o JavaFX
        // e em seguida chama automaticamente o método 'start()', que você sobrescreve.
        // 'launch()' é chamado diretamente pela classe Application porque é um método estático.

    }

    @Override
    public void start(Stage palcoPrimario) throws Exception {       // Metodo Abstrato da classe Pai (Application)
        // (é aqui onde fica o metodo "start" que será chamado
        // pelo lauch)

        // Esse metodo "start" possui um estágio "(Stage *)", esse
        // Stage recebe um nome (Podemos chamar do que quiser) no
        // caso eu chamei de "estagioPrimario"

        // No final, você precisa chamar esse estagio "nomeDoEstagio.show();"
        // para que dessa forma você consiga vizualizar o conteúdo dele
        // Criando um palco novo palco, se faz:
        // Stage palcoPrimario = new Stage();

        // Criando um nó raiz para organizar todos os nós diferentes (que são os componentes):
        Group root = new Group();

        // Criando uma Cena para o palco e adicionando o nó raiz (root) a cena:
        Scene scene = new Scene(root, Color.SKYBLUE);

        // Criando o palco e adicionando a cena á ele:
        palcoPrimario.setScene(scene);

        // Adicionando um titulo a esse palco:
        palcoPrimario.setTitle("Minha primeira tela no JavaFX");

        // Colocando uma imagem na tela:
        Image minhaImagem = new Image("Logo_Coracao.png");
        palcoPrimario.getIcons().add(minhaImagem);

        // Definindo Largura:
        palcoPrimario.setWidth(860);
        // Definindo altura:
        palcoPrimario.setHeight(450);
        // Desabilita (false) ou habilita (true) a redimenção:
        palcoPrimario.setResizable(false);
        // Define a posição X de onde vai aparecer a tela:
        // palcoPrimario.setX(50);
        // Define a posição Y de onde vai aparecer a tela:
        // palcoPrimario.setY(50);

        // Definir Como tela cheia de imediato:
        // palcoPrimario.setFullScreen(true);
        // palcoPrimario.setFullScreenExitHint("Você pode sair precionando ESC"); // Definindo mensagem de escape
        // palcoPrimario.setFullScreenExitKeyCombination(KeyCombination.keyCombination("ESC")); // Adicionando nova
        // para escape
        // Exibindo Palco
        palcoPrimario.show();

    }

}
