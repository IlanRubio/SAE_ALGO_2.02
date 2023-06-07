package vue;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import modele.Joueur;
import modele.Quete;

import java.util.ArrayList;

/**
 * Classe VBoxAffichageSolution - représente le panneau d'affichage de l'ordre des quetes de la solution.
 * Il affiche les quetes de la solution dans un tableau.
 */
public class GridPaneAffichageSolution extends GridPane {

    private Label chLabNbQueteJoueur;
    private String chNbQueteJoueur;
    private Label chLabDureeJoueur;
    private String chDureeJoueur;
    private Label chLabSolution = new Label("Solution");
    private TableView<Quete> chTable = new TableView<Quete>();
    private String chExpJoueur;
    private Label chLabExpJoueur;

    /**
     * Constructeur de la classe GridPaneAffichageSolution.
     * Initialise les éléments graphiques et configure la table de solution.
     *
     * @param j1 le joueur qui contiendra les infos à recupérer
     */
    public GridPaneAffichageSolution(Joueur j1){
        int ligne = 0;
        GridPane.setHalignment(chLabSolution, HPos.CENTER);
        this.add(chLabSolution,0,ligne++,6,1);

        Separator sepateurSol = new Separator();
        sepateurSol.setPadding(new Insets(10,0,5,0));
        this.add(sepateurSol,0,ligne++,6,1);

        Label labelExpJoueur = new Label("Experience du joueur : ");
        chExpJoueur = Integer.toString(j1.getExpJ());
        chLabExpJoueur = new Label(chExpJoueur);
        add(labelExpJoueur,0,ligne);
        add(chLabExpJoueur, 3, ligne++);

        Label labelDureeJoueur = new Label("Duree : ");
        chDureeJoueur = Integer.toString(j1.getDureeJ());
        chLabDureeJoueur = new Label(chDureeJoueur);
        add(labelDureeJoueur,0,ligne);
        add(chLabDureeJoueur, 3, ligne++);

        Label labelNbQueteJoueur = new Label("Nombre de quete : ");
        chNbQueteJoueur = Integer.toString(j1.getQueteAcc().size());
        chLabNbQueteJoueur = new Label(chNbQueteJoueur);
        add(labelNbQueteJoueur,0,ligne);
        add(chLabNbQueteJoueur, 3, ligne++);


        TableColumn<Quete, Integer> numColumn = new TableColumn<>("Numéro des quetes dans l'ordre: ");
        numColumn.setCellValueFactory(new PropertyValueFactory<>("Numero"));
        chTable.getColumns().add(numColumn);
        add(chTable,0,ligne);

        chTable.setPrefSize(200,200);
        numColumn.setStyle("-fx-alignment: CENTER;");
        update(j1, j1.getQueteAcc());

    }

    /**
     * Met à jour l'affichage du planning des réservations.
     *
     * @param j1 le joueur qui contiendra les infos à recupérer
     * @param parQuetesAcc la liste des quetes dans la solution
     */
    public void update (Joueur j1, ArrayList<Quete> parQuetesAcc){
        chLabExpJoueur.setText(Integer.toString(j1.getExpJ()));
        chLabNbQueteJoueur.setText(Integer.toString(j1.getQueteAcc().size()));
        chLabDureeJoueur.setText(Integer.toString(j1.getDureeJ()));

        chTable.getItems().clear();
        for (Quete quete : parQuetesAcc){
            chTable.getItems().add(quete);
        }
    }
}
