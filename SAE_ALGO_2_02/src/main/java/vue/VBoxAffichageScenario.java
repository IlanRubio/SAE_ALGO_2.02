package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import modele.LectureFichierQuete;
import modele.Quete;
import modele.Scenario;

import java.util.ArrayList;
import java.util.TreeMap;

import static modele.ConstanteScenario.SCENARIO;

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
     * @param parTreeMapScenario les quetes du scenario à afficher
     */
    public VBoxAffichageScenario(TreeMap<Integer, ArrayList<Quete>> parTreeMapScenario){
        chTable.setPrefSize(620,500);
        TableColumn<Quete, Integer> numeroCol = new TableColumn<>("Numero");
        numeroCol.setCellValueFactory(new PropertyValueFactory<>("Numero"));

        TableColumn<Quete, String> positionCol = new TableColumn<>("Position");
        positionCol.setCellValueFactory(new PropertyValueFactory<>("PosAsString"));

        TableColumn<Quete, String> preconditionCol = new TableColumn<>("Precondition");
        preconditionCol.setCellValueFactory(new PropertyValueFactory<>("PrecondAsString"));

        TableColumn<Quete, Integer> dureeCol = new TableColumn<>("Duree");
        dureeCol.setCellValueFactory(new PropertyValueFactory<>("Duree"));

        TableColumn<Quete, Integer> experienceCol = new TableColumn<>("Experience");
        experienceCol.setCellValueFactory(new PropertyValueFactory<>("ExpAsString"));

        TableColumn<Quete, String> intituleCol = new TableColumn<>("Intitule");
        intituleCol.setResizable(true);
        intituleCol.setCellValueFactory(new PropertyValueFactory<>("Intitule"));


        chTable.getColumns().addAll(numeroCol, positionCol, preconditionCol, dureeCol, experienceCol, intituleCol);

        getChildren().addAll(chLabScenario, chTable);
        update(0,parTreeMapScenario.get(0));

    }


    public void update(Integer parNumScenario, ArrayList<Quete> parQuetes) {
        chLabScenario.setText(SCENARIO[parNumScenario]);
        chTable.getItems().clear();
        for (Quete quete : parQuetes) {
            chTable.getItems().add(quete);
        }
    }


}
