package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import modele.Quete;

import java.util.ArrayList;

/**
 * Classe VBoxAffichageSolution - représente le panneau d'affichage de l'ordre des quetes de la solution.
 * Il affiche les quetes de la solution dans un tableau.
 */
public class VBoxAffichageSolution extends VBox {

    private Label chLabScenario = new Label("Scenario");
    private TableView<Quete> chTable = new TableView<Quete>();

    /**
     * Constructeur de la classe VBoxAffichageSolution.
     * Initialise les éléments graphiques et configure la table de solution.
     *
     * @param parQueteAcc les quetes de la solution à afficher
     */
    public VBoxAffichageSolution(ArrayList<Quete> parQueteAcc){

    }
}
