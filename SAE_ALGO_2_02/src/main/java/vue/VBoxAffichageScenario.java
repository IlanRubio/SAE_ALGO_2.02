package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import modele.Quete;

import java.util.TreeMap;

/**
 * Classe VBoxAffichageSolution - représente le panneau d'affichage des quetes du scenario.
 * Il affiche les quetes du scenario dans un tableau.
 */
public class VBoxAffichageScenario extends VBox {
    private Label chLabScenario = new Label("Scenario");
    private TableView<Quete> chTable = new TableView<Quete>();

    /**
    * Constructeur de la classe VBoxAffichageScenario.
    * Initialise les éléments graphiques et configure la table de scenario.
    *
    * @param parTreeMapQuete les quetes du scenario à afficher
    */
    public VBoxAffichageScenario(TreeMap<Integer, Quete> parTreeMapQuete){

    }
}
