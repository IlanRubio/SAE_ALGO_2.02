package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import modele.Quete;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Classe VBoxAffichageSolution - représente le panneau d'affichage de l'ordre des quetes de la solution.
 * Il affiche les quetes de la solution dans un tableau.
 */
public class VBoxAffichageSolution extends VBox {

    private Label chLabSolution = new Label("Solution");
    private TableView<Quete> chTable = new TableView<Quete>();

    /**
     * Constructeur de la classe VBoxAffichageSolution.
     * Initialise les éléments graphiques et configure la table de solution.
     *
     * @param parQueteAcc les quetes de la solution à afficher
     */
    public VBoxAffichageSolution(ArrayList<Quete> parQueteAcc){
        TableColumn<Quete, Integer> numColumn = new TableColumn<>("Numéro");
        numColumn.setCellValueFactory(new PropertyValueFactory<>("Numero"));

        TableColumn <Quete, String> intituleColumn = new TableColumn<>("Intitule");
        intituleColumn.setCellValueFactory(new PropertyValueFactory<>("Intitule"));

        TableColumn <Quete, Integer> expColumn = new TableColumn<>("Expérience");
        expColumn.setCellValueFactory(new PropertyValueFactory<>("ExpAsString"));

        TableColumn <Quete, Integer> dureeColumn = new TableColumn<>("Durée");
        dureeColumn.setCellValueFactory(new PropertyValueFactory<>("Duree"));

        TableColumn<Quete, String> preconditionCol = new TableColumn<>("Precondition");
        preconditionCol.setCellValueFactory(new PropertyValueFactory<>("PrecondAsString"));
        chTable.getColumns().addAll(numColumn,intituleColumn,expColumn,dureeColumn, preconditionCol);

        chTable.setPrefSize(550,500);
        getChildren().addAll(chLabSolution,chTable);
        updateSolution(parQueteAcc);
    }

    /**
     * Met à jour l'affichage du planning des réservations.
     *
     * @param parQuetes la liste des quetes de la solution
     */
    public void updateSolution (ArrayList <Quete> parQuetes){
        chTable.getItems().clear();
        for (Quete quete : parQuetes){
            chTable.getItems().add(quete);
        }
    }
}
