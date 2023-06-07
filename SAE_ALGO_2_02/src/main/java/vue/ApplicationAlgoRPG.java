package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Cette classe représente l'application.
 * Elle hérite de la classe Application et implémente la méthode start.
 */
public class ApplicationAlgoRPG extends Application {
    /**
     * La méthode start est appelée lors du lancement de l'application.
     * Elle crée une scène avec un conteneur HBox et l'affiche dans une fenêtre.
     *
     * @param stage la fenêtre principale de l'application
     */
    public void start(Stage stage) {
        HBoxRoot root = new HBoxRoot();
        Scene scene = new Scene(root, 1500, 380);
        stage.setScene(scene);
        stage.setTitle("Solution RPG");
        stage.show();
    }

    /**
     * Le point d'entrée de l'application.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
